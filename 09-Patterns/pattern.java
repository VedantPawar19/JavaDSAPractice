//Questions: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class pattern {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n){
        for (int i = 0; i < (n * 2)-1; i++) {
            int cols = i>=n ? cols = (n*2)-2-i : i;
            // if(i>=n){
            //     cols = (n*2)-2-i;
            // }else{
            //     cols = i;
            // }
            for(int j = 0; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
