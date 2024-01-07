public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = {2,4,9,4,5,1,6,7};
        System.out.println(MinElement(arr));
    }

    static int MinElement(int[] array){
        // Return the minimum value in the array

        if(array.length==0){
            System.out.println(Integer.MIN_VALUE);
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

}
