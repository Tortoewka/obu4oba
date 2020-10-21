package com.company;

public class Main {
    private static Object mon = new Object();

    public static void mOne() {
        synchronized (mon) {

        long a = System.currentTimeMillis();
        System.currentTimeMillis();
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }
    }

    public static void mtwo() {
        float[] a2 = new float[size];
        float[] a1 = new float[size];
        float[] arr = new float[size];
        long a = System.currentTimeMillis();
        System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }



    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) throws Exception {
        mOne();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                mtwo();

            }
        };
        new Thread(r, "Thread-1").start();
        new Thread(r, "Thread-2").start();







    }

}
