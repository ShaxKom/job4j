package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void firstMax(){
        MultiMax check = new MultiMax();
        int result = check.max(1,2,3);
        assertThat(result,is(3));
    }

    @Test
    public void secondMax(){
        MultiMax check = new MultiMax();
        assertThat(check.max(1,5,3),is(5));
    }

    @Test
    public void thirdMax(){
        MultiMax check = new MultiMax();
        assertThat(check.max(4,5,9),is(9));
    }

    @Test
    public void allEqual(){
        MultiMax check = new MultiMax();
        assertThat(check.max(7,7,7),is(7));
    }
}
