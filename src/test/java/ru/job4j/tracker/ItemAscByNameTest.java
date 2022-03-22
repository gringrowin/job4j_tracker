package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemAscByNameTest {

    @Test
    public void whenItemAscByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("And"));
        items.add(new Item("Zak"));
        items.add(new Item("Ben"));
        items.add(new Item("Sam"));
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("And"));
        expected.add(new Item("Ben"));
        expected.add(new Item("Sam"));
        expected.add(new Item("Zak"));
        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(expected));
    }
}
