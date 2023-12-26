public class Overloading{
    public static void main(String[] args){
        // int a=55;
        fun(30);
        fun(20, 40);
        fun("Hello");
        // System.out.println(a); //Value of a will not change with method fun() above it will stay 55 because of scope of methods

        int sum2 = sum(2,3);
        System.out.println(sum2);
        int sum3 = sum(4,6,7);
        System.out.println(sum3);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a, int d){ //This method will give error of there is only int b, since same datatype parameter is overloading fun()
        System.out.println(a);
    }

    static void fun(String c){

    }
    /* For overloading: parameters datatype must be different OR number of parameter must be different*/

    //Example of basic use: If we give sum(2, 3) it will run first one and if we give sum(4,4,6) second one will be executed.
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
