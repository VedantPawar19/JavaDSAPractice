package Day10.PracticeArray_SolvedOnLeetcode;
import java.util.*;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] newArray = new int[nums.length]; 
        
        for(int i = 0; i<nums.length; i++){
            if(index[i]>=i){
                newArray[index[i]] = nums[i];
            }else{
                insertatIndex(newArray, nums[i], index[i]);
            }
            System.out.println(Arrays.toString(newArray));
        }
        return newArray;
    }
    
    void insertatIndex(int[] newArray, int num, int pos){
        for (int i = newArray.length - 1; i > pos; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[pos] = num;
    }
}

/* 
// Simple solution using arraylist found in leetcode runtime analysis chart after submitting above solution

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
*/
