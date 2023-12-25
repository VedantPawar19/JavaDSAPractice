import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Take input from user until user presses X or x
        int ans = 0;
        while (true) {

            //Input operation choice
            System.out.println("Enter the Operator (+ - * / %) OR (X or x) to close");
            char op = input.next().trim().charAt(0);
            
            if (op == '+' || op == '-' || op =='*' || op=='/' || op =='%'){
                //Input two number
                System.out.println("Enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
            
                if (op =='+'){
                    ans = num1+num2;
                }if(op == '-'){
                    ans = num1-num2;
                }if(op == '*'){
                    ans = num1*num2;
                }if (op =='/'){
                    ans = num1/num2;
                }if(op =='%'){
                    ans = num1%num2;
                }
                System.out.println("Answer of the operation is: "+ans);

            }else if(op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("Invalid Operation!!");
            }
        }
        input.close();
    }
}
