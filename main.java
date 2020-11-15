package com.company;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main  {


    public static void sortByArr(Integer a[]) {

        Integer temp = a[0];
        a[0] = a[1];
        a[1] = temp;

    }





    public static void main(String[] args) {
        fruit Orange = new fruit(1.0,5);
        fruit Apple = new fruit(1.5,3);
       box<Double> Box1 = new box(Orange);
        box<Double> Box2 = new box(Apple);




        Integer[] arr;

        arr = new Integer[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.print(arr[0]);
        System.out.println(arr[1]);
        sortByArr(arr);
        System.out.print(arr[0]);
        System.out.println(arr[1]);

        ArrayList<Integer> IntegersList  = new ArrayList<Integer>(Arrays.asList(arr));
System.out.println(IntegersList);

        System.out.println("вес корзины с яблоками " +  fruit.getWeight(Apple.getQuantity(),Apple.getVes()));
        System.out.println("вес корзины с апельсинами " +   fruit.getWeight(Orange.getQuantity(),Orange.getVes()));



}}
