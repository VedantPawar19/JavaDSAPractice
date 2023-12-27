import java.util.*;

public class SwapArrayElements{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] a, int index0, int index1){
        int temp = a[index0];
        a[index0] = a[index1];
        a[index1] = temp;
    }
}