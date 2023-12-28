public class RicherCustomerWealth{
    public static void main(String[] args){
        int[][] arr2d = {{3,7,1},{9,1,5},{0,4,7,3}};
        System.out.println(maximumWealth(arr2d));
    }
    
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE; 
            
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account]; 
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}