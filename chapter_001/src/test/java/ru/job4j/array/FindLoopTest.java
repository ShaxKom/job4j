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
    public void whenArrayHas5Then0(){
        FindLoop find = new FindLoop();
        int[] input = new int[] {5,4,8};
        int value = 5;
        int expect = 0;
        int rst = find.indexOf(input,value);
        assertThat(rst,is(expect));
    }

    @Test
    public void whenArrayHasNotInput(){
        FindLoop find = new FindLoop();
        int[] input = new int[] {8,1,23,7,6};
        int value = 5;
        int expect = -1;
        int rst = find.indexOf(input,value);
        assertThat(rst,is(expect));

    }

}
