// https://leetcode.com/problems/find-the-highest-altitude/submissions/

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,10,100,-50,-500};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int[] altitude = altitude(gain);
        int ans = max(altitude);
        return ans;
    }

    static int[] altitude(int[] gain){
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude[i+1] = altitude[i] + gain[i];
        }
        return altitude;
    }

    static int max(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
