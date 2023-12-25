// methods or functions. It helps avoid repeatations of code by making method and calling it again and again.
// import java.util.Scanner;

public class Methods { 
    public static void main(String[] args) {
        // greeting();

        // int ans = sum();
        // System.out.println(ans);

        // int ans2 = sum2(50, 20);
        // System.out.println(ans2);

        String personalized = msg2("Vedant Pawar");
        System.out.println(personalized);
    }

    // static void greeting(){
    //     System.out.println("Hello, World");
    // }

    // static int sum() {
    //     Scanner in = new Scanner(System.in);
    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     int sum = a+b;
    //     in.close();
    //     return sum;
    //     // System.out.println("this will never execute since return is above");
    // }
   
    // //Like below example we can pass integer and string parameters in methods
    // static int sum2(int a, int b) {
    //     int sum = a+b;
    //     return sum;
    // }

    static String msg2(String name){
        String message = "Hello, "+name;
        return message;
    }
}
