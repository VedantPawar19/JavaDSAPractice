package Day12;
//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

public class OddInRangeWithoutLoop {
    public static void main(String[] args) {
        int low = 8;
        int high = 8;
        int count = countOdds(low, high);
        System.out.println(count); 
    }

    static int countOdds(int low, int high) {
        if(low%2==0){
            low++;
        }
        if(high%2==0){
            high--;
        }
        
        int ans = (high-low)/2+1; 
        return ans;
    }
    
}
