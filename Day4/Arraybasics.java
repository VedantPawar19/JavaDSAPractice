import java.util.*;
public class Arraybasics{
    public static void main(String[] args){
        //Syntax
        //datatype[] variable_name = new datatype[size]
        //ex. store 5 roll numbers

        // int[] rnos0 = new int[5];
        // String[] rnos = new String[5];
        // int[] rnos2 = {1,2,3,4,5};

        // int[] rnos3; //declaration of array only. rnos3 is getting defined in the stack.
        // rnos3 = new int[5]; //intialisation; object is being created in the memory (heap) here actually.

        // System.out.println(rnos0[0]); //by default all elemnts are 0 after intialisation of int type
        // System.out.println(rnos2[0]);
        // System.out.println(rnos2[0]); //llly for string they are null

        //Taking INPUT in arrays
        Scanner in = new Scanner(System.in);

        //method one (but time consuming and not practicle)
        int[] arr = new int[5];
        arr[0]=57;
        arr[1]=332;
        arr[2]=96;
        arr[3]=885;
        arr[4]=55;
        // [57,332,96,885,55]
        //    System.out.println(arr[3]);

        //    // input using for loop
        //    for(int i=0; i<arr.length;i++){
        //     arr[i]=in.nextInt();
        //    }

        //    System.out.println(arr[3]);

        //    // print using for loop
        //     for(int i=0; i<arr.length;i++){
        //         System.out.print(arr[i]+" ");
        //    }     
        //    //OR

        //    for(int num : arr){
        //     System.out.print(num+" "); //here num represents element in array arr
        //    }

        //Arrays class has default method to print arrays with Arrays.toString(arr)
        System.out.println(Arrays.toString(arr));


        //Array of objects
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        in.close();
    }
}