public class EvenDigitsElementsArray2{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,54,65,345,-4653};
        System.out.println(HowManyEven(arr));
    }

    static int HowManyEven(int[] nums){
        int count = 0;
        for(int num: nums){
            if (even(num)){
                count++;
            }
        }return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if(num<0){
            num*=-1;
        }
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
}