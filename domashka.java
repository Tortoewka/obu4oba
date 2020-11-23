package domachka;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static void readNextText(int z) {
        long t = System.currentTimeMillis();
        try (RandomAccessFile raf = new RandomAccessFile("ntc.txt", "r")) {
                        for (int i = 0; i < z; i++) {
                raf.seek(i);
                System.out.print((char) raf.read());
            }

            System.out.println("время операции {" + (System.currentTimeMillis() - t) + "}");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"), "UTF-8")) {

            int x;

            while ((x = isr.read()) != -1) {
                System.out.print((char) x);
            }

        }

        ArrayList<InputStream> ali = new ArrayList<>();
        ali.add(new FileInputStream("1.txt"));
        ali.add(new FileInputStream("2.txt"));
        ali.add(new FileInputStream("3.txt"));
        ali.add(new FileInputStream("4.txt"));
        ali.add(new FileInputStream("5.txt"));

        SequenceInputStream in1 = new SequenceInputStream(Collections.enumeration(ali));
        int x;
        while ((x = in1.read()) != -1) {
            System.out.print((char)x);
        }
        in1.close();


        int num = 0;
do{ int a = 1800;
    a=a+1800;
    System.out.println("чтобы прочитать следующую страницу введите 1 ");
    System.out.print("чтобы перестать читать введите 2 ");
    System.out.println();
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    readNextText(a);}
        while (num != 2) ;

        }
    }
