package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemDescByNameTest {

    @Test
    public void whenItemDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("And"));
        items.add(new Item("Zak"));
        items.add(new Item("Ben"));
        items.add(new Item("Sam"));
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("Zak"));
        expected.add(new Item("Sam"));
        expected.add(new Item("Ben"));
        expected.add(new Item("And"));
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }
}
