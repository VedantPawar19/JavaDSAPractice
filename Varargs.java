import java.util.*;

public class Varargs{
    public static void main(String[] args){
        fun(2,3,4,5,6,7,3,4,5,3,4,3,4,3,4);
        multiple(2,3,"HEllO", "HI");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
//varargs must be in last
    static void multiple(int a, int b, String ...v){

    }
}