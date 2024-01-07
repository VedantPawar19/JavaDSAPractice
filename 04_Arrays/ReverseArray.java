import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
        
    static void Reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while (start<end){
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] a, int index0, int index1){
        int temp = a[index0];
        a[index0] = a[index1];
        a[index1] = temp;
    }
}