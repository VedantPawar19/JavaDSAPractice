import java.util.Scanner;

//Question: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class MaxofThreeInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Max: "+max(a,b,c));
        System.out.println("Min "+min(a,b,c));

        input.close();

    }

    static int max(int a, int b, int c){
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c){
        int min = a;
        if (b<min){
            min = b;
        }
        if (c<min){
            min = c;
        }
        return min;
    }
    
}
