package hw2;

import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1.a " + Arrays.toString(array));
        invertArray(array);
        System.out.println("1.b " + Arrays.toString(array));

        int [] array3 = new int [8];
        fillArray(array3);
        System.out.println("2 " + Arrays.toString(array3));

        int [] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("3.a " + Arrays.toString(arr2));
        doublingArray(arr2);
        System.out.println("3.b " + Arrays.toString(arr2));

        int [][] tableArray = new int [5][5];
        fillDiagonal(tableArray);
        for (int i=0; i<tableArray.length; i++) {
            for (int j=0; j< tableArray[i].length ; j++) {
                System.out.print(tableArray[i] [j] + " ");
            }
            System.out.println();
        }



    }

    public static void invertArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            array [i] = (array [i] == 1) ? 0 : 1;
        }
    }

    public static void fillArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
    }

    public static void doublingArray ( int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
    }

    public static void fillDiagonal ( int [] [] array) {
        for (int i = 0; i < 5; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;

        }

    }
}
