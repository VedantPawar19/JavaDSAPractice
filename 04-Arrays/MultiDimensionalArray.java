import java.util.*;

public class MultiDimensionalArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
            1 2 3 
            4 5 6
            7 8 9
        */

        // int[][] arr= new int[3][4] //Defining size of rows 2d array is mandatory (i.e [3] here). Its okay if column's length are not defined
        
        int[][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(Arrays.toString(arr2d[1])); //toString method is basically for loop is internal code of java

        //input using for loop
        int[][] arr3 = new int[3][2];
        for (int row=0; row<arr3.length; row++){
            for (int col=0; col<arr3[row].length; col++){
                arr3[row][col] = in.nextInt();
            }
        }
        //output using for loop
        for (int row=0; row<arr3.length; row++){
            for (int col=0; col<arr3[row].length; col++){
                System.out.print(arr3[row][col]+" ");
            }
            System.out.println();
        }
        //OR
        for (int[] a : arr3){
        System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}