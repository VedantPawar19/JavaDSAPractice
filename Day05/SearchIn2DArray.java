public class SearchIn2DArray{
    public static void main(String[] args){
        //Search element in 2d array

        int[][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;
        System.out.println(Search(arr2d, target));
    }

    static boolean Search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    //If want to return indices [i,j] of that number then just change type from boolean to int[] 
    //and return int[] {i, j} and if false int[] {-1,-1}
    //and also System.out.println(Arrays.toString(Search(arr2d, target))) in main function since array as output
}