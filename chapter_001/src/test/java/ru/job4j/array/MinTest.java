package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * Тест-класс для Min.java
 * @author Shakhzod Kamilov
 */
public class MinTest {
    @Test
    public void whenFirstMin(){
        int[] input = {4,35,915,32,15,7,8};
        int expect = 4;
        int result = Min.findMin(input);
        assertThat(result,is(expect));
    }

    @Test
    public void whenLastMin(){
        assertThat(Min.findMin(new int[]{54,41,8,3}),is(3));
    }

    @Test
    public void whenMiddleMin(){
        assertThat(
                Min.findMin(
                        new int[]{7,9,2,84,5}
                        ),
                is(2));
    }
}
