import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(IsEven(num)){
            System.out.println(num+" is even number.");
        }else{
            System.out.println(num+" is odd number.");
        }

        input.close();
    }

    static boolean IsEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
