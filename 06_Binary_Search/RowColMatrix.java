// Find target element in 2D-Array which is sorted row wise and column wise differently.

import java.util.Arrays;

public class RowColMatrix{
    public static void main(String[] args){
        int[][] arr2D = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr2D, 29)));
    }

    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length - 1;

        while(r < arr[0].length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c] > target){
                c--;
            }else{
                r++;
            }
        }

        return new int[]{-1,-1};
    }
}