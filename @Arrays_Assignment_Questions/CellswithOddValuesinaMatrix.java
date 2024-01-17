// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

// import java.util.Arrays;

public class CellswithOddValuesinaMatrix {
    public static void main(String[] args) {
        int m, n;
        m = 2; n = 2;
        int[][] indices = {{1,1},{0,0}};
        int ans = oddCells(m, n, indices);
        System.out.println(ans);
    }

    // static int oddCells(int m, int n, int[][] indices) {
    //     int[][] matrix = new int[m][n];

    //     // zero matrix
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             matrix[i][j] = 0;
    //         }
    //     }
    //     System.out.println(Arrays.deepToString(matrix));

    //     // final matrix after increments
    //     increment(m, n, indices, matrix);
    //     System.out.println(Arrays.deepToString(matrix));

    //     // finding odd elements count
    //     int count = 0;
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             if(matrix[i][j] % 2 != 0){
    //                 count++;
    //             }
    //         }
    //     }

    //     return count;
    // }

    // static void increment(int m, int n, int[][] indices, int[][] matrix) {
    //     int i = 0;
    //     while(i<indices.length){
    //         int j = 0; //col of indices
            
    //         for(int r = 0; r < matrix.length; r++){
    //             for (int c = 0; c < matrix[r].length; c++) {
    //                 if(r==indices[i][j]){
    //                     matrix[r][c]++;
    //                 }   
    //                 if(c==indices[i][j+1]){
    //                     matrix[r][c]++;
    //                 }

    //             }
    //         }

    //         i++;
    //     }
    // }

    
    //Better approach

    static int oddCells(int m, int n, int[][] indices) {
        int[] rowIncrements = new int[m];
        int[] colIncrements = new int[n];
        
        for(int index[] : indices){
            rowIncrements[index[0]]++;
            colIncrements[index[1]]++;
        }

        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int cellValue = rowIncrements[i] + colIncrements[j];
                if(cellValue % 2 == 1){
                    count++;
                }
            }
        }

        return count;
    }

}


