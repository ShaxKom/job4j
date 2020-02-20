package ru.job4j.array;

/**
 *  Класс для переварачивания массива
 * @author Shakhzod Kamilob
 * @version 1
 */
public class Turn {
    /**
     *
     * @param array Входной массив
     * @return Возвращает перевёнутый массив
     */
    public static int[] back(int[] array){
        for (int index=0; index<=array.length-index-1 ;index++){
            //if (index>=array.length-index ) break;
            int temp = array[index];
            array[index]=array[array.length-1-index];
            array[array.length-1-index]=temp;
        }
        return array;
    }
}
