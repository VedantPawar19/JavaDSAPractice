import java.util.Arrays;
// https://leetcode.com/problems/flipping-an-image/

public class FlippingImage {
    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length; i++){
            reverseAndInvert(image[i]);
        }
        return image;
    }

    static int[] reverseAndInvert(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            //inverse
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //invert
            arr[start] = invert(arr[start]);
            if(start!=end){
                arr[end] = invert(arr[end]);
            }

            start++;
            end--;
        }

        return arr;
    }
    
    static int invert(int num){
        return (num==0) ? 1 : 0;
    }

}
