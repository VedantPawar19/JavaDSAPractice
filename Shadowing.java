public class Shadowing {
    static int a = 10; //this will be shadowed at line 6-7 but won't be shadowed with method fun()
    public static void main(String[] args) {
        System.out.println(a);
        fun();
        int a = 20;
        System.out.println(a);
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
