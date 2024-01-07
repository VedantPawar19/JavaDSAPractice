package Day09;

import java.util.Scanner;

//Define a method to find out if a number is prime or not.

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Isprime(num));
        in.close();
    }

    static String Isprime(int num){
        int temp = 2;
        while((temp*temp)<=num){
            if(num%temp==0){
                return "Not Prime";
            }temp++;
        }return "Prime";
    }
}
