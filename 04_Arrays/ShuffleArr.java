//https://leetcode.com/problems/shuffle-the-array/
//Solved on leetcode. Class name is default from leetcode

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i = 0;
        int j = n; 
        
        for(int k = 0; k<2*n; k+=2){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            System.out.println(nums[i]);
            System.out.println(nums[j]);
            i++;
            j++;
            // k++;
        }
        
        return ans;
    }
}
