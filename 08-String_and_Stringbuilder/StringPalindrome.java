//check if string is palindrom or not
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();

        System.out.println(str);
        System.out.println(reversedStr);

        return str.equals(reversedStr.toString());
    }
}
