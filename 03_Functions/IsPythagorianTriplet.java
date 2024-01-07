package Day09;
import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not. 
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number). 3 4 3, 5 12 13, 8 15 17, 7 24 25

public class IsPythagorianTriplet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers to check pythagorean triplet or not: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(triplet(a,b,c)){
            System.out.println("Pythagorean Triplet");
        }else{
            System.out.println("Not Pythagorean Triplet");
        }

        in.close();
    }

    static boolean triplet(int a, int b, int c){
        if(a*a+b*b==c*c ||a*a+c*c==b*b||a*a==b*b+c*c){
            return true;
        }
        return false;
    }
}