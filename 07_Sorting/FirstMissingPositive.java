//https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args){
        int[] arr = {0, 3,4,-1,6,1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; //correct position of element currently present at index i
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
            System.out.println(Arrays.toString(arr)); //just to understand how array changing for each itration
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
