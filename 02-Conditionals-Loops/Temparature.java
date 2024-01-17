import java.util.Scanner;

public class Temparature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temparature in celcius: ");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius*9/5+32);
        System.out.println(celsius+" celsius = "+fahrenheit+ " fahrenheit");
        input.close();
    }
}
