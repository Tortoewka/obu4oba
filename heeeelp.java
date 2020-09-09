public class java2 {


    private static void cum(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
            System.out.print(a[i]);
        }

    }
public static void main(String[] args){
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    cum(arr);
}

 

}
