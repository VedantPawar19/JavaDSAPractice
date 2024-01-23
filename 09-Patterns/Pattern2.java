//Questions: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Pattern2 {
    public static void main(String[] args) {
        pattern31_1(4);
    }
    static void pattern31_1(int n){
        n = 2 * n;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                int atEveryIndex = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
