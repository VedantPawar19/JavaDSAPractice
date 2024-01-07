import java.util.Scanner;
//Check whether upper case or lower case
public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else if(ch>='A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }else{
            System.out.println("Not character");
        }

        input.close();
    }
}
