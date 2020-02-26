package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/**
 * Тест-класс для MinDiapason.java
 * @author Shakhzod Kamilov
 */
public class MinDiapasonTest {
    @Test
    public void whenFirstMin(){
        assertThat(
                MinDiapason.findMin(
                new int[]{4,351,1,38,8,84,1},2,5),
                is(1));
    }

    @Test
    public void whenLastMin(){
        assertThat(
                MinDiapason.findMin(
                new int[]{7,5,3,10,5,2},2,5),
                is(2));
    }

    @Test
    public void whenMiddleMin(){
        assertThat(
                MinDiapason.findMin(
                new int[]{6,7,10,1,9,10,51},2,5),
                is(1));
    }
}
