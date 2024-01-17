import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class VotingAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int age = input.nextInt();
        if(IsEligible(age)){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }

        input.close();
    }

    static boolean IsEligible(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
}
