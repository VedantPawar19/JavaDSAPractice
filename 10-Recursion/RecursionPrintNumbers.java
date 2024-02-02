public class RecursionPrintNumbers{
    public static void main(String[] args){
        // write a program to count down from a given number to 1.
        number(5);
    }

    static void number(int number){
        if(number < 1){
            System.out.println();
        }else{
            System.out.println(number);
            number(number - 1);
        }
    }
}