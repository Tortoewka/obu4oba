public class java2 {


    private static void cum(int[] a) {//метод заменяющий 0 на 1 и 1 на 0. задание 1
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void cum1(int[] a, int[] b) { // метод заполняющий пустой массив значениями. задание 2
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void cum3(int[] a) {// метод принимающий на вход массив и умножающий числа менбше 6 на 2. задание 3
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) a[i] = a[i] * 2;
            System.out.print(a[i] + " ");
        }

    }

    private static void cum4(int[][] a) {// квадратный цикличный массив с 1 по диоганали. задание 5
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");

            }
        }
        System.out.println();
    }

    private static void cum5(int[] a, int[] b, int n) { //метод сдвигающий числа в массиве на n
        for (int i = 0; i < a.length; i++) {
            if (i + n > a.length) {
                a[i] = b[n - (a.length - i)];
            } else
                a[i] = b[i + n];
            System.out.println("стало" + a[i] + " было" + b[i]);
        }
    }

    private static void cum6(int[] a) {// метод должен вернуть true если все сойдется.
        int cuma = 0;
        int cumb = 0;
        for (int i = 0; i < a.length; i++) {


            for (int j = 0; j < a.length; j++) {
                if (i < j) {
                    cuma = cuma + a[j];
                } else cumb = cumb + a[j];


            }
            if (cuma == cumb) {
                System.out.println(cuma == cumb);
            }
        }
    }

    private static void cum7(int[] a) {//максимальное и минимальное значение задание 4
        int max = 0;
        int min = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println();
        System.out.println("макс"+max + " мин " + min);
    }


    public static void main(String[] args) {
        int[] as1 = {1, 1, 1, 2, 1};
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] ar1 = {1, 4, 7, 10, 13, 16, 19, 22};
        int[] ar2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] ar0 = new int[8];
        int[][] arr1 = {
                {15, 2, 3,},
                {2, 3, 4,},
                {3, 4, 5,}
        };
        int[] a1 = new int[10];
        int[] b1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 3;


        cum(arr);//метод заменяющий 0 на 1 и 1 на 0. задание 1
        cum1(ar0, ar1);// метод заполняющий пустой массив значениями. задание 2
        cum3(ar2);// метод принимающий на вход массив и умножающий числа менбше 6 на 2. задание 3
        cum7(ar2);//максимальное и минимальное значение. задание 4
        cum4(arr1);// квадратный цикличный массив с 1 по диоганали. задание 5
        cum6(as1);// метод должен вернуть true если все сойдется.задание 6
        cum5(a1, b1, n);//метод сдвигающий числа в массиве на n. задание 7

    }
}
