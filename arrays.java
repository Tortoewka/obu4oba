package domachka;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_with_4 {
    public static void main(String[] args) {
        //int[] numbers = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        //int[] numbers = {2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int[] numbers = {3, 4, 1, 5, 9, 4, 4, 7, 4, 8, 6};


        Arrays_with_4 arrays_with_4 = new Arrays_with_4();
        Integer[] arrList = arrays_with_4.getAfterLast4(numbers);

        for (int i = 0; i < arrList.length; i++) {
            System.out.print(arrList[i] + " ");
        }
    }

    public Integer[] getAfterLast4(int[] array){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = array.length - 1; i >= 0 && array[i] != 4; i--) {
            arr.add(array[i]);
        }

        if(arr.size() == array.length){
            throw new RuntimeException("Exception: в исходном массиве нет 4!");
        }
        Collections.reverse(arr);
        Integer[] array1 = arr.toArray(new Integer[arr.size()]);

        return array1;
    }
}
