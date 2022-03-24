package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Клас описывает работу простейших банковских операций по
 * добавлению клиента в базу, открытию счета клиенту и переводу денежных средств между счетами
 * @author Maxim Pavlishin
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных клиентов и счетов осуществляется в коллекции типа HashMap
     * по ключу User и значение Account
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход данные Клиента и добавляет ее в коллекцию
     * если такого клиента в коллекции еще нет.
     * @param user клиент которые добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод который добавляет к данным клиента информацию о его счете
     * @param passport принимает паспортные данные и производятся поиск клиента.
     * @param account добавляет клиенту счет, если этого счета у клиента открыто не было
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Проводит поиск клиента в коллекции по паспортным данным
     * @param passport принимаются паспортные данные по которым производится поиск в коллекции
     * @return возвращает User если поиск успешен иначе возвращает null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Проводит поиск счета в коллекции по паспортным данным клиента и реквизитам счета.
     * @param passport принимаются паспортные данные и находится клиент
     * @param requisite если клиент нашелся то проводится поиск по коллекции его счетов
     *                  по реквизитам
     * @return возвращает счет если поиск успешен иначе (если не найден клиент или счет) возвращает null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
        List<Account> accounts = users.get(user);
        for (Account account : accounts) {
            if (requisite.equals(account.getRequisite())) {
                return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод принимает паспортные данные клиента и реквизиты счета с которого перечисляются деньги
     * и паспортные данные клиента и реквизиты счета на который деньги перечисляются, а также сумма операции     *
     * @param srcPassport паспортные данные клиента владельца счета-источника
     * @param srcRequisite реквизиты счета-источника
     * @param destPassport паспортные данные клиента получателя средств
     * @param destRequisite реквизиты счета получателя
     * @param amount сумма операции
     * @return возвращает истину если операция прошла успешно (найдены клиенты и их счета и
     *         на счете источнике достаточно средств) и ложь если операция неудачна.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            double srcBalance = srcAccount.getBalance();
            double destBalance = destAccount.getBalance();
            if (srcBalance >= amount) {
                srcAccount.setBalance(srcBalance - amount);
                destAccount.setBalance(destBalance + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
