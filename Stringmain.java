package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) {
       String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; 

        String[][] stringArray = convertStringToArray(s);
        System.out.println(calculate(stringArray));
    }

    static String[][] convertStringToArray(String s) {
        String tmp = s + "\n";
        for (int i = 0, space = 0, n = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == ' ') space++;
            if (tmp.charAt(i) == '\n') {
                if (space == 3) space = 0;
                else throw new MyException("размер матрицы, полученной из строки, не равен 4x4");
            }
        }

        int length = s.split("\n").length;// узнаем длинну строки
        String[][] result = new String[length][length];// создаем двумерный массив
        String[] clearN = s.split("\n");// убираем из массива "\n"

        for (int i = 0; i < length; i++) {
            String[] clearSpaces = clearN[i].split(" ");// убираем из массива пробелы

            for (int j = 0; j < length; j++) {
                result[i][j] = clearSpaces[j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        return result;
    }

    static double calculate(String[][] s) { //вычисляем сумму и делим её на 2
        int sum = 0;

        for (int i = 0;i<s.length;i++ ) {
            for (int j = 0;j<s.length;j++ ) {
                try {
                    sum += Integer.parseInt(s[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("в одной из ячеек полученной матрицы не число");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }

        return sum / 2;
    }
}
