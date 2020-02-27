package ru.job4j.array;

/**
 * Проверяет заполнена ли определённая строка массива символом 'X'
 * @author Shakhzod Kamilov
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row){
        boolean result = true;
        for(int i=0;i<board.length;i++){
            if (board[row][i]!='X'){
                result=false;
                break;
            }
        }
        return result;
    }
}
