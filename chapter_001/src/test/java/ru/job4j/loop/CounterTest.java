package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import  org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty(){
        int expect = 30;
        int rsl = Counter.sumByEven(0,10);
        assertThat(rsl,is(expect));
    }

    @Test
    public void whenSumEvenBySecond(){
        int expect = 2550;
        int rsl = Counter.sumByEven(0,100);
        assertThat(rsl,is(expect));
    }

    @Test
    public void sumTestOne(){
        int expect = 92;
        int rsl = Counter.sum(8,15);
        assertThat(rsl,is(expect));
    }
}
