package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] stringsLeft = left.split("\\.");
        String[] stringsRight = right.split("\\.");
        int leftInt = Integer.parseInt(stringsLeft[0]);
        int rightInt = Integer.parseInt(stringsRight[0]);
        return Integer.compare(leftInt, rightInt);
    }
}
