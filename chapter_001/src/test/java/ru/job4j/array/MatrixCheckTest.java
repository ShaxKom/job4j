package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тетс-класс для MatrixCheck.java
 * @author Shakhzod Kamilov
 * @version 2
 */

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal(){
        char[][] input = {
                {'X',' ',' ',' '},
                {'X','X','X','X'},
                {'X',' ',' ',' '},
                {'X',' ',' ',' '},
                {'X',' ',' ',' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input,1);
        assertThat(result,is(true));
    }
    @Test
    public void whenHasNotMonoHorizontal(){
        char[][] input = {
                {'X','X','X','X'},
                {' ',' ','X','X'},
                {'X',' ',' ',' '},
                {'X',' ',' ',' '},
                {' ',' ',' ',' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input,1);
        assertThat(result,is(false));
    }
    @Test
    public void whenHasMonoVertical(){
        char[][] input={
                {' ','X',' ','X',' '},
                {' ','X',' ','X',' '},
                {' ',' ',' ','X',' '},
                {' ',' ',' ','X',' '} };
        boolean result = MatrixCheck.monoVertical(input,3);
        assertThat(result,is(true));
    }

    @Test
    public void whenHasNotMonoVertical(){
        char[][] input = {
                {' ',' ',' ','X'},
                {' ',' ',' ','X'},
                {' ',' ',' ',' '},
                {' ',' ',' ','X'} };
        boolean result = MatrixCheck.monoVertical(input,3);
        assertThat(result,is(false));

    }
}
