package SomeMethodes;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWorkArrays {

    /*1 Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
  2 Задать пустой целочисленный массив размером 8.
   Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
  3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
  написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
  4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
  5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
  заполнить его диагональные элементы единицами, используя цикл(ы);
  6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
  метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
  Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
  checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
  7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
  при этом метод должен циклически сместить все элементы массива на n позиций.
  8 **** Не пользоваться вспомогательным массивом при решении задачи 7.*/


    public static void main(String[] args) {
        int[] ar0 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ar0));
        change(ar0);
        System.out.println(Arrays.toString(ar0));

        int[] ar1 = new int[8];
        System.out.println(Arrays.toString(ar1));
        filler(ar1);
        System.out.println(Arrays.toString(ar1));

        int[] ar2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ar2));
        doubling(ar2);
        System.out.println(Arrays.toString(ar2));

        int[] ar3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(findMax(ar3));
        System.out.println(findMin(ar3));


        int[][] ar4 = new int[5][5];
        fillDiagonal(ar4);
        printTwoDiArray(ar4);






    }

//    6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
//             checkBalance ([2, 1, 1, 2, 1]) → false,
//             checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||,
//    эти символы в массив не входят.

    private static boolean checkBalance(int[] a){
        int left = 0;
        for (int i = 0; i < a.length - 1; i++) {
            left += a[i];
            int right = 0;
            for (int j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if (left == right) return true;
        }
        return false;
    }

    //        5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
//  заполнить его диагональные элементы единицами, используя цикл(ы);
    public static void fillDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - 1 - i] = 1;

        }

}
    private static void printTwoDiArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    //    4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
//    3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static int findMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int findMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max])
                max = i;
            }
            return max;

    }


    private static void doubling(int[] a) {
        for (int i = 0; i < a.length; i++) {
        if (a[i] < 6) {
            a[i] *= 2;
            }
        }
    }

//    2 Задать пустой целочисленный массив размером 8.
//    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    private static void filler (int[] a) {
        for (int i = 0; i < a.length; i++){
          a[i] = i * 3 + 1;
        }
}

    // Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    private static void change(int[] a) {
        for (int i =0;  i < a.length; i++){
//           a[i] = (a[i] == 0) ? 1 : 0;
//           a[i] = (a[i] - 1) * -1;
//           a[i] = (a[i] + 1) % 2;
             a[i] = 1 - a[i];


        }
    }
}

