public class RecursionPrintNumbers1{
    public static void main(String[] args){
        // print first n natural numbers using recursion
        int n = 10;
        numberPrint(1, n);
    }

    static void numberPrint(int number, int n){
        if(number == n){
            System.out.print(n);
        }else{
            System.out.println(number);
            numberPrint(number + 1, n);
        }

        // if(number == n){
        //     System.out.print(n);
        //     return;
        // }
        // System.out.println(number);
        // numberPrint(number + 1, n);
    }
}