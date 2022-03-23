package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByName() {
        Comparator<Job> comb = new JobAscByName();
        int rsl = comb.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByPriority() {
        Comparator<Job> comb = new JobAscByPriority();
        int rsl = comb.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> comb = new JobDescByPriority();
        int rsl = comb.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> comb = new JobDescByName();
        int rsl = comb.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndPrority() {
        Comparator<Job> comb = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = comb.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}