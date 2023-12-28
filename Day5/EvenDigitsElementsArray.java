//How many elments in array contains even number of digits 
public class EvenDigitsElementsArray{
    public static void main(String[] args){
        int[] arr = {123,345,33,5678};
        System.out.println(EvenDigitsElements(arr));
    }

    static int EvenDigitsElements(int[] array){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if (even(array[i])){
                count++;
            }
        }
        return count;
    }

    //method to check even digits or not
    static boolean even(int num){
        //converting int to str with concatenation
        String str = ""+num;
        int L= str.length();
        if(L%2==0){
            return true;
        }
        return false;
    }
}


/*OR
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i]>9 && nums[i]<100 || nums[i]>999 && nums[i]<10000 || nums[i]==100000 ){
                count++;
            }
        }
        return count;
    }
}
 */