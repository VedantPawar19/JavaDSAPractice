import java.util.Scanner;
public class Occurrence {
    public static void main(String[] args){
        //Count the number of times 'n' ex. 3 occuring in the certain number (maybe phone number or any number ex. 63931546326 )
        Scanner input = new Scanner(System.in);
        long number = 333331245654891256L;
        System.out.println("Enter the number to find its occurrence");
        int n = input.nextInt();
        int count = 0;
        while (number!=0) {
            if(number%10==n){
                count++;
            }
            number/=10; 
        }        
        System.out.println(n+" is "+count+" times.");
        input.close();
    } 
}
