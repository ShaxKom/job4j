package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тетс-класс для MatrixCheck.java
 * @author Shakhzod Kamilov
 * @version 4
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


    @Test
    public void whenDiagonal(){
        char[][] input = {
                {'X',' ','X',' '},
                {' ','X',' ','X'},
                {' ','X','X',' '},
                {' ',' ',' ','X'}
        };
        char[] expect = {'X','X','X','X'};
        char[] result = MatrixCheck.extractDiagonal(input);
        assertThat(result,is(expect));
    }

    @Test
    public void whenDiagonal2(){
        char[][] input = {
                {'X','X',' ',' '},
                {' ','X',' ',' '},
                {' ','X',' ',' '},
                {' ','X',' ','X'}
        };
        char[] expect = {'X','X',' ','X'};
        char[] result = MatrixCheck.extractDiagonal(input);
        assertThat(result,is(expect));
    }

    @Test
    public void whenDataMonoByTrueThenTrue(){
        char[][] input = {
                {' ',' ','X','X'},
                {' ',' ','X','X'},
                {' ',' ',' ','X'},
                {' ',' ','X','X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result,is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse(){
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result,is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

}
