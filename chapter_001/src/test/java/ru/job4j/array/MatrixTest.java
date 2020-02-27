package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void when2On2(){
        int[][] input = new int[2][2];
        int[][]expect = {{1,2},{2,4}};
        int[][] result = Matrix.multiple(2);
        assertThat(result,is(expect));
    }

    @Test
    public void when9On9(){
        int[][] input = new int[9][9];
        int expect = 56;
        int result = (Matrix.multiple(9))[6][7];
        assertThat(result,is(expect));
    }
}
