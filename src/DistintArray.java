import java.util.Arrays;



public class DistintArray {
    static int mid=0;
    public static void main(String[] args) {
        int[] array  =  new int[]{1,3,5,6};
        int x  =5;
        int indexOfElement  =  binarySearch(array,x);
        System.out.println("last index = " +indexOfElement );

    }
    private   static int binarySearch(int array[],int target){
        int left =   0;
        int right  = array.length-1;
        Arrays.sort(array);
        return  binarySearch(array,left,right,target);

    }

    static int binarySearch(int arr[], int left, int right, int x)
    {
        if (right >= left) {
             mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // We reach here when element is not present
        // in array
        return mid;
    }
}
