//Take input integer and tell if prime or not 

import java.util.Scanner;


public class Qisprime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // System.out.println(isprime(n));

        if (n==1){
            System.out.println(n+" is neither prime not composite");
        }
        else if(isprime(n)){
            System.out.println(n+ " is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

        in.close();
    }

    static boolean isprime(int n) {
        // if(n<=1){
        //     return false;
        // }
        int i = 2;
        while(i*i<=n){
            if (n%i==0){
                return false;
            }i++;
        }
        return i*i>n;
    }
}
