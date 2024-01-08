import java.util.Scanner;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class CircleAreaCircumference {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float r = in.nextFloat();
        System.out.println("Entered radius: "+r);
        System.out.println("Circumference is: "+Cirf(r));
        System.out.println("Area is: "+ area(r));
        in.close();
    }

    static float area(float r){
        float ans = (22/7)*r*r;
        return ans;
    }
    
    static float Cirf(float r){
        float ans = 2*(22/7)*r;
        return ans;
    }
}