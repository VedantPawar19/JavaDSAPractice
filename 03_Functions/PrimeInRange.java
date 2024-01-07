package Day09;
import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
//https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/


public class PrimeInRange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Start and End range to find prime numbers in between: ");
        int start = in.nextInt();
        int end = in.nextInt();
        primeIn(start, end);

        in.close();
    }

    static void primeIn(int start, int end){
        start = Math.max(2, start);

        for(int i = start; i<=end; i++){
            if(i>1 && Isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static boolean Isprime(int num){
        int temp = 2;
        while((temp*temp)<=num){
            if(num%temp==0){
                return false;
            }temp++;
        }return true;
    }        
}
