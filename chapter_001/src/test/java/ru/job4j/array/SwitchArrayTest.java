package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SwitchArrayTest {
    @Test
    public void whenSwap1and3() {
        int[] input = new int[]{1, 4, 3, 2, 5};
        int[] expect = new int[]{1, 2, 3, 4, 5};
        int[] rst = SwitchArray.swap(input, 1, 3);
        assertThat(rst,is(expect));
    }

    @Test
    public void whenSwap4and9(){
        int[] expect = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] input = new int[]{0,1,2,3,9,5,6,7,8,4};
        int[] rst = SwitchArray.swap(input,4,input.length-1);
        assertThat(rst,is(expect));
    }

}
