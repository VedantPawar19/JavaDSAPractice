import java.util.Arrays;

public class MethodsString {
    public static void main(String[] args) {
        String name = "Vedant Pawar Hello World";
        char[] array = name.toCharArray(); //this will print ->  [V, e, d, a, n, t,  , P, a, w, a, r]
        System.out.println(Arrays.toString(array));

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name); //original not changed new created while doing name.toLowerCase()

        System.out.println(name.indexOf('P'));
        System.out.println("   Vedant          ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
