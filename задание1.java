package Lesson_4.DZ;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class domashka {
    static volatile char abc = 'A';

    public static void main(String[] args) {
       Object lock = new Object();
        class MyTask implements Runnable {

            final char a;
            final char b;

            public MyTask(char a, char b) {
                this.a = a;
                this.b = b;
            }


            @Override
            public void run() {
              synchronized (lock) {
                    for (int i = 0; i < 5; i++) {
                        while (abc!=a) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(abc);
                        abc = b;
                      lock.notifyAll();
                    }
                                    }
            }

        }
        new Thread(new MyTask('A', 'B')).start();
        new Thread(new MyTask('B', 'C')).start();
        new Thread(new MyTask('C', 'A')).start();


    }
}
