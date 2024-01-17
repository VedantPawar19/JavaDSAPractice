import java.util.Arrays;

public class Output {
    public static void main(String[] args) {

        // Internally every println statement always outputs string with toString method . Below functions overloading is happening.
        // for int, string etc println always calls different default toString methods related to datatype 
        System.out.println(65);
        System.out.println("Vedant");

        //but in the case of arrays. we use toString method present in Arrays class since we want to consider square brackets, custom conditions of arrays while printing
        System.out.println(Arrays.toString(new int[]{1, 2, 5})); //we can create our own tostring methods like this to override the function
    }
}
