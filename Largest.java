import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        // input three numbers and find larges number from those
        Scanner input = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }

        //With math class
        // int max = Math.max(a,b);
        System.out.println("Largest number is "+max);

        input.close();
    }
}