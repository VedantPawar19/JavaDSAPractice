//Search in range of array and return index of that element

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {2,3,5,65,322,4,33};
        int target = 4;
        int start=0;
        int end = 5;
        System.out.println(Linearsearch(array, target, start, end));
    }

    static int Linearsearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
