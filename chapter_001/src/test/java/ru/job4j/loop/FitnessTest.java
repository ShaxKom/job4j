package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik(){
        int expect = 0;
        int rsl = Fitness.calc(95,00);
        assertThat(rsl,is(expect));
    }

    @Test
    public void whenIvanLessByOneNik(){
        int rsl = Fitness.calc(90,95);
        assertThat(rsl,is(1));
    }

    @Test
    public void whenIvanLessByFewNik(){
        int rsl = Fitness.calc(30,60);
        assertThat(rsl,is(2));
    }


}
