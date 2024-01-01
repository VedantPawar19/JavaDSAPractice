package Day9;
import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
//https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sum(n);
        System.out.println(ans);

        in.close();
    }

    static int sum(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        return sum;
    }
}
