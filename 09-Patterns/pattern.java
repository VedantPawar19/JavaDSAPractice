//Questions: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class pattern {
    public static void main(String[] args) {
        pattern31(4);
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

    static void pattern17(int n){
        for(int row = 0; row < n * 2 - 1; row++){

            int cols = row < n? row * 2 + 1 : (row - n + (n - (row - n + 1)))* 2 + 1;
            
            int noOfSpaces = Math.abs(n - row - 1);
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            int count = row >= n ? n - (row - n + 1) : row + 1;

            for(int j = 1; j <= cols; j++){
                    if(j <= cols/2){
                        System.out.print(count+"");
                        count--;
                    }else{
                        System.out.print(count+"");
                        count++;
                    }                
            }
            System.out.println();
        }
    }   

    static void pattern28(int n){
        for (int i = 0; i < (n * 2)-1; i++) {
            int cols = i>=n ? cols = (n*2)-2-i : i;
            
            int noOfSpaces = n - cols;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for(int j = 0; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row = 0; row < n; row++){
            int cols = (row * 2) + 1;

            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            int count = row + 1;

            for(int j = 1; j <= cols; j++){
                    if(j <= cols/2){
                        System.out.print(count+" ");
                        count--;
                    }else{
                        System.out.print(count+" ");
                        count++;
                    }                
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2 * n - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
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
