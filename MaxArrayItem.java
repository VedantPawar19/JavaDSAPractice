public class MaxArrayItem{
    public static void main(String[] args){
        int[] arr = {};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 5, 4));
        
    }

    //method to find max value
    static int max(int[] array){
        //edge cases
        if (array.length == 0){
            return -1;
        }

        int maxno = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxno<array[i]){
                maxno=array[i];
            }
        }
        return maxno;
    }

    //max value in range of indices
    static int maxRange(int[] array, int start, int end){
        //edge cases
        if (end<start){
            return -1;
        }
        if (array == null){
            return -1;
        }

        int maxno = array[start];
        for (int i = start; i < end; i++) {
            if (maxno<array[i]){
                maxno=array[i];
            }
        } 
        return maxno;
    }
}

//there are more edge cases like outof bound end value i.e end>array.length and more...w