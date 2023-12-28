public class SearchElement {
    public static void main(String[] args) {
        //Search element in array and return its index if not found return -1
        int[] array = {1,2,3,4,5,6,7,8,9};
        int Target = 8;
        System.out.println(Linearsearch(array, Target));
    }

    static int Linearsearch(int[] arr, int target){
        if (arr.length==0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
