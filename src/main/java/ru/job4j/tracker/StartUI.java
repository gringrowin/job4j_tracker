package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
    Item item = new Item("Объект");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    String itemCreated = item.getCreated().format(formatter);
    System.out.println(item.getName() + " создан " + itemCreated);
    }
}