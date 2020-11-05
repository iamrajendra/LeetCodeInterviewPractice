import java.util.Arrays;

public class DistintArray {
    public static void main(String[] args) {
        int [] array  = new int[]{1,3,5,6};
        System.out.println("args = " + searchInsert(array,array.length,5));


    }

    static int searchInsert(int A[], int n, int target) {
        if(n < 1) {
            return 0;
        }

        int low = 0;
        int high = n-1;
        int mid;
        int pos=0;
        while(low <= high) {
            mid = low + (high-low)/2;

            if(A[mid] == target) {
                return mid;
            } else if(A[mid] > target) {
                high = mid - 1;
                pos = mid;
            } else {
                low = mid + 1;
                pos = mid + 1;
            }
        }

        return pos;
    }
    
}
