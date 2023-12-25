import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // String fruit = input.next();
        // switch (fruit) {
        //     case "mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "grapes":
        //         System.out.println("A small fruit");
        //         break;
        //     default:
        //         System.out.println("Please enter valid fruit");
        //         break;
        // }

        // int day = input.nextInt();
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 4 -> System.out.println("Wednesday");
        //     case 5 -> System.out.println("Thursday");
        //     case 6 -> System.out.println("Friday");
        //     case 7 -> System.out.println("Saturday");
        //     case 3 -> System.out.println("Sunday");
        //     default -> System.out.println("Enter Valid day.");
        // }

        //We can use break in a way that if we want all cases above break sentence to give same value as current case. For example in below if we want to find if day is weekday or weekend we can only give break after case 5 and 7 so that all the cases from 1 to 5 will have case 5 output and cases 6, 7 will have case 8 output since break is at 5 and 7.
        // int day = input.nextInt();
        // switch (day){
        //     case 1:
        //     case 2:
        //     case 3: 
        //     case 4:
        //     case 5:{
        //         System.out.println("Weekday");
        //     }break;
        //     case 6: 
        //     case 7:{
        //         System.out.println("Weekend");
        //     }break;
        //     default:{
        //         System.out.println("Enter valid day.");
        //     }
        // }
        //OR
        int day = input.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter valid day.");
        }


        input.close();
    }
}
