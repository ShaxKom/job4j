package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int count=1;
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++) {
                array[i][j] = count;
                count++;
            }
        System.out.println(array[2][2]);
    }
}
