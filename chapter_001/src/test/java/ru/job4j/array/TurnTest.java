package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Тест-класс для Turn.java
 * @author Shakhzod Kamilov
 */
public class TurnTest {
    @Test
    public void when1to9() {
        int[] input = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rst = Turn.back(input);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] expect = new int[]{1, 2, 3, 4, 5};
        int[] rst = Turn.back(input);
        assertThat(rst, is(expect));
    }
}
