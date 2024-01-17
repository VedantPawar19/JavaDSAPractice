public class PrettyPrinting {
    public static void main(String[] args){
        float num = 43.15798f;
        System.out.printf("The formatted number is: %.2f",num);
        System.out.println();

        System.out.printf("Pie: %.2f", Math.PI);

        System.out.printf("Hello my name is %s and I am %s", "Vedant","Cool"); //order in which placeholders are placed

        /*
            %c - Character
            %d - Decimal number (base 10)
            %e - Exponential floating-point number
            %f - Floating-point number
            %i - Integer (base 10)
            %o - Octal number (base 8)
            %s - String
            %u - Unsigned decimal (integer) number
            %x - Hexadecimal number (base 16)
            %t - Date/time
            %n - Newline
         */
    }
}
