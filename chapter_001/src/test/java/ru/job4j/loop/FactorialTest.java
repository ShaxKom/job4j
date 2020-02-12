package ru.job4j.loop;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty(){
        int expect = 120;
        int rsl = Factorial.calc(5);
        assertThat(rsl,is(expect));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne(){
        int expect = 1;
        int rsl = Factorial.calc(0);
        assertThat(rsl,is(expect));
    }


}
