package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book0 = new Book("Java", 853);
        Book book1 = new Book("C#", 754);
        Book book2 = new Book("C++", 432);
        Book book3 = new Book("Clean code", 100);
        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Книга " + books[index].getName() + " страниц " + books[index].getPages());
        }
        System.out.println("Change 0 and 3 index!");
        books[0] = book3;
        books[3] = book0;
        for (int index = 0; index < books.length; index++) {
            System.out.println("Книга " + books[index].getName() + " страниц " + books[index].getPages());
        }
        System.out.println("Print only \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println("Книга " + books[index].getName() + " страниц " + books[index].getPages());
            }
        }
    }
}
