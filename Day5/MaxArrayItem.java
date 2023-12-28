public class MaxArrayItem{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,8,6,5,5,4165,1651,312,33,2,14,5,65,25,0};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 10, 15));
        
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
            return Integer.MAX_VALUE;
        }
        if (array == null){
            return Integer.MAX_VALUE;
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