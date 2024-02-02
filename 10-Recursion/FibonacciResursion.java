public class FibonacciResursion {
    public static void main(String[] args){
        // Find nth fibonacci number
        System.out.println(fibo(50));
        // int n = 10;
        // for (int i = 0; i <= n; i++) {
        //         System.out.println(fibo(i));
        // }
    }

    static long fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
