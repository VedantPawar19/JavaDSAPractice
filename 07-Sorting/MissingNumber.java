//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber{
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]; //correct position of element currently present at index i
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
            System.out.println(Arrays.toString(arr)); //just to understand how array changing for each itration
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}