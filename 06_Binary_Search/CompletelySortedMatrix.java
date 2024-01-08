// Completely sorted array

import java.util.Arrays;

public class CompletelySortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,15,21,24},
            {27,34,36,39},
            {45,51,57,63},
            {70,75,79,85}
        };
        int[] ansArr = search(matrix, 63);
        System.out.println(Arrays.toString(ansArr));
    }


    static int[] binarysearch(int[][] matrix,int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd-cStart);
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }

        return new int[]{-1,-1};
    }


    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) {
            return binarysearch(matrix, 0, 0, cols-1, target);
        }

        //run the loop until only two rows are remaining then to apply binary search on only four parts in two rows
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //check if target is in middle column in those two positions otherwise check in four parts 
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        //check in four parts in those 2 rows
        //check in first half
        if(target <= matrix[rStart][cMid-1]){
            return binarysearch(matrix, rStart, 0, cMid-1,target);
        }
        //check in second half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarysearch(matrix, rStart, cMid+1, cols - 1,target);
        }
        //check in third half
        if(target <= matrix[rStart+1][cMid-1]){
            return binarysearch(matrix, rStart+1, 0, cMid-1,target);
        }
        //check in fourth half
        if(target >= matrix[rStart+1][cMid+1] && target <= matrix[rStart+1][cols-1]){
            return binarysearch(matrix, rStart+1, cMid+1, cols - 1,target);
        }

        return new int[]{-1,-1};
    }
}
