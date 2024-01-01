package Day9;
/*Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1 */
//https://www.javatpoint.com/factorial-program-in-java

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int Factorial = Factorials(n);
        System.out.println("Factorial of "+n+" is "+ Factorial);
        
        in.close();
    }

    static int Factorials(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans *= i; 
        }
        return ans;
    }
}
