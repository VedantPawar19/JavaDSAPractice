import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b"); // operator + can be only applied to primitives or if one of them is string
        // System.out.println("a" - "b"); //operator - cannot applied to non primitives like string
        System.out.println((char)('a'+ 3));
        System.out.println('a'+ 3);
        System.out.println("abc" + 12); // integet will be converted into Integet that will call toString()
        System.out.println("a"+'b'); //If one of the datatype is string, answer will be string

        ArrayList<Integer> List = new ArrayList<>();
        List.add(5);
        List.add(7);
        System.out.println(List);

        System.out.println("name "+List);

        // String ans = new Integer(50) + " " + List ;
        // System.out.println(ans);

        //operator overloading is not supported in java (expect + to support string concatination only) since it results in poor code (can be in cpp or python)
        
    }
}
