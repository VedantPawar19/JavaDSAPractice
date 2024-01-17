public class reversenum {
    public static void main(String[] args){
        int num = 123456789;
        // int ans = 0;
        while(num!=0){
            int rem = num%10;
            System.out.print(rem);
            num/=10;
            //or
            // ans = ans*10+rem;
        }
        // System.out.println();
        // System.out.println(ans);
    }
}
