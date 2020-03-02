package ru.job4j.array;

/**
 * Проверяет заполнена ли определённая строка или столбец матрицы символом 'X'
 * @author Shakhzod Kamilov
 * @version 2
 */

public class MatrixCheck {
    /**
     * Проверяет строки
     * @param board входная матрица
     * @param row строка для проверки
     * @return возвращает логическое выражение
     */
    public static boolean monoHorizontal(char[][] board, int row){
        boolean result = true;
        for(int i=0;i<board[row].length;i++){
            if (board[row][i]!='X'){
                result=false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяет столбцы
     * @param board входная матрица
     * @param colomn столбец для проверки
     * @return возвращает логическое вырадение
     */
    public static boolean monoVertical(char[][] board, int colomn){
        boolean result = true;
        for (int i=0;i<board.length;i++){
            if(board[i][colomn]!='X'){
                result=false;
                break;
            }
        }
        return result;
    }
}
