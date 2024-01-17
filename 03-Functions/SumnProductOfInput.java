import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
//Define a method that returns the product of two numbers entered by user.
public class SumnProductOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(sum(a,b));
        System.out.println(Product(a,b));

        in.close();
    }

    static int sum(int a, int b){
        int ans = a+b;
        return ans;
    }

    static int Product(int a, int b){
        int ans = a*b;
        return ans;
    }
}
