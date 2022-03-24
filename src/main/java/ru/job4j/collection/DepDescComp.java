package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] o1Split = o1.split("/");
        String[] o2Split = o2.split("/");
        int rsl = o1Split[0].compareTo(o2Split[0]);
        return rsl == 0 ? o1.compareTo(o2) : o2.compareTo(o1);
    }
}
