import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll number");
        int rno = input.nextInt();
        System.out.println("your roll number is "+rno);
        input.close();
    }
}