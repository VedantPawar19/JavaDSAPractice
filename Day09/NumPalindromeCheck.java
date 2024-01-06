package Day09;
//Write a function to find if a number is a palindrome or not. Take number as parameter.
//https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/
import java.util.Scanner;

public class NumPalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //if we input number which is starting with 0 ex. 00500 directily in code instead of in.nextInt() then it will be considered as octal literate in java i.e. it will take input value 320
        if(IsPalindrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        in.close();
    }

    static boolean IsPalindrome(int n){
        // if(reverse(n)==n){
        //     return true;
        // }
        // return false;
        return (reverse(n)==n);
    }

    static int reverse(int num){
        int ans = 0;
        while(num!=0){
            int rem = num%10;
            ans =  ans*10+rem; 
            num/=10;
        }
        System.out.println(ans);
        return ans;
    }
}