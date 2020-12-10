package domachka;

public class Main {
    public static void main(String[] args) {
        fillSnake(5,7);
    }

    private static void fillSnake(int a, int b) {

        int[][] array = new int[b][a];
        int c = 0, d = 0, s = 1;

        while (s + 1 < b * a) {

            //Движемся вправо.
            while ((d + 1) < a && array[c][d + 1] == 0)
                array[c][d++] = s++;

            //Движемся вниз.
            while ((c + 1) < b && array[c + 1][d] == 0)
                array[c++][d] = s++;

            //Движемся влево.
            while (d > 0 && array[c][d - 1] == 0)
                array[c][d--] = s++;

            //Движемся вверх.
            while (array[c - 1][d] == 0)
                array[c--][d] = s++;
        }

        //Заполним последнию ячейку
        for (int x = 0; x < b; x++) {
            for (int y = 0; y < a; y++) {
                if (array[x][y] == 0) array[x][y] = s;
            }
        }

        //Посмотрим что получилось у нас
        for (int x = 0; x <b; x++) {
            for (int y = 0; y < a; y++) {
                System.out.print(array[x][y] + "  ");
            }
            System.out.println();
        }
    }
}
