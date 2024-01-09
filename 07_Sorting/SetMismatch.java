import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch

public class SetMismatch {
    public static void main(String[] args){
        int[] num = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(num)));
    }

    static int[] findErrorNums(int[] nums) {
    //cycle sort then I can iterate and compare to find which element is not in place and thus finding which element is needed in that place
        cycleSort(nums);
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i + 1){
                index = i;
            }
        }
        return new int[]{nums[index], index+1};
    }

    static void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
    }
}
