package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Тест-класс для класса FindLoop
 * @author Shakhzod Kamilov
 */
public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 4, 8};
        int value = 5;
        int expect = 0;
        int rst = find.indexOf(input, value);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenArrayHasNotInput() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 1, 23, 7, 6};
        int value = 5;
        int expect = -1;
        int rst = find.indexOf(input, value);
        assertThat(rst, is(expect));

    }

    @Test
    public void whenFind5() {
        int expect = 6;
        int[] input = {4, 8, 6, 1, 2, 84, 5, 65, 21, 89};
        int result = FindLoop.indexOf(input, 5, 4, 8);
        assertThat(result, is(expect));
    }

    @Test
    public void whenDoNotInclude() {
        int expect = -1;
        int[] input = {84, 35, 321, 813, 8, 61, 2, 321, 13, 72};
        int result = FindLoop.indexOf(input, 72, 3, 7);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort() {
        int[] input = {4, 3, 1, 2, 5, 9, 6, 7, 8};
        int[] expect = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = FindLoop.sort(input);
        assertThat(result, is(expect));
    }

}
