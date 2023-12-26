public class Armstrongnumbers{
    public static void main(String[] args){
        //Question is print all three digit armstrong numbers
        //The number is armstrong number if sum of its saparate digits cube is same number ex. 153

        // System.out.println(isArmstrong(155)); // printing if number is armstrong or not
        for (int i = 100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            sum += rem*rem*rem;
            n/=10;
        }

        if (sum==original){
            return true;
        }
        return false;
    }

}