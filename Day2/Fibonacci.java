import java.util.Scanner;
//Find nth fibonacci number
public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
    
        while (count<=n) {
            int oldb=b;
            b=a+b;
            a=oldb;
            count++;
        }
        System.out.println(n+"th fibonacci number is "+b);
        input.close();

        // for(int ){
        //     b = a+b;
        //     System.out.println(b);
        // }
    }
}