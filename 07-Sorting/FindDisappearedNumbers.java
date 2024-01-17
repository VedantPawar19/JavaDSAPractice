//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));        

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> missingList = new ArrayList<>();
        cyclesort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                missingList.add(i+1);
            }
        }

        return missingList;
    }

    static void cyclesort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctPos = arr[i]-1; //correct position of element currently present at index i
            if(arr[i] != arr[correctPos]){
                swap(arr, i, correctPos);
            }else{
                i++;
            }

            System.out.println(Arrays.toString(arr));
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
