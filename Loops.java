import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        //if-else condition
        // int a = 10;
        // if (a>22) {
        //     System.out.println("condition is true");
        //     }
        //     else {
        //     System.out.println("condition is false");
        //     }

        //while loop
        // int count = 1;
        // while(count != 5){
        //     System.out.println(count);
        //     count++;
        // }

        //for loop
        // for(int count = 1; count!=5; count++){
        //     System.out.println(count);
        // }

        // multiconditional
        // int salary = 15400;
        // if (salary<10000){
        //     salary += 1000;
        // }else if(salary<20000){
        //     salary += 2000;
        // }else{
        //     salary += 3000;
        // }
        // System.out.println(salary);

        Scanner input = new Scanner(System.in);
        // //sum of n natural numbers
        // int n = input.nextInt();
        // int sum=0;
        // for(int num = 1; num<=n; num++){
        //     sum += num;
        // }System.out.println(sum);

        input.close();

        //do-while loop
        // int a = 1;
        // do{
        //     System.out.println("Hello, World!");
        // }while(a!=1);

        int a = 1;
        do{
            System.out.println("Hello, World!");
            a++;
        }while(a<=5);
    }
}
