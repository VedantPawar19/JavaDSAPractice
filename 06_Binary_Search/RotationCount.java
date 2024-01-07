package Day13;
//https://www.geeksforgeeks.org/problems/rotation4723/1
//Solved on geeksforgeeks

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr, arr.length));
    }

    static int findKRotation(int arr[], int n) {
        int pivotIndex = findPivotIndex(arr, n);
        int rotations = 0;
        if(pivotIndex!=n-1){
            rotations = pivotIndex + 1;
        }
        return rotations;
    }

    static int findPivotIndex(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // Found the pivot element
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                // Pivot is on the right side
                start = mid + 1;
            } else {
                // Pivot is on the left side
                end = mid-1;
            }
        }

        // No rotation, pivot is at last
        return start;
    }
}
