package jarvis;

import java.io.*;
import java.util.Scanner;

public class java2 {


    public static void main(String[] args) {

        try {
            StringBuilder s1 = new StringBuilder("text");
            for (int i = 0; i < 50; i++) {
                s1.append(i);
                PrintStream ps = new PrintStream(new FileOutputStream("text.txt", true));
                ps.print(s1);

            }
            FileOutputStream fos = new FileOutputStream("text.txt", true);
            fos.close();

            StringBuilder s2 = new StringBuilder("0text");
            for (int i = 0; i < 50; i++) {
                s2.append(i);
                PrintStream ps2 = new PrintStream(new FileOutputStream("text2.txt", true));
                ps2.print(s2);

            }

            FileOutputStream fos2 = new FileOutputStream("text.txt", true);
            fos2.close();

            Scanner scanner1 = new Scanner(new FileInputStream(("text.txt")));
            Scanner scanner2 = new Scanner(new FileInputStream(("text2.txt")));

            PrintStream ps3 = new PrintStream(new FileOutputStream("text3.txt", true));
            while (scanner1.hasNext()) {
                ps3.append(scanner1.next());


                while (scanner2.hasNext()) {
                    ps3.append(scanner2.next());

                }
                Scanner scanner3 = new Scanner(new FileInputStream(("text3.txt")));
                while (scanner3.hasNext()) {
                    System.out.println(scanner3.next());
                }

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
