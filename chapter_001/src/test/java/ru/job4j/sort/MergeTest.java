package ru.job4j.sort;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/**
 * Тест-класс для Merge.java
 */
public class MergeTest {
    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = Merge.merge(new int[0], new int[0]);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAsOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(new int[]{1, 3}, new int[]{2, 4});
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}
