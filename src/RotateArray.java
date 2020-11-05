import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int  [] array  = new int[]{1,2,3,4,5,6,7};
        System.out.println("Before Array = " + Arrays.toString(array));
        int k =3;

rotate(array,k);
    }

    public static  void rotate(int[] nums, int k) {
        int right = nums.length-k;
        int left  = k;
        int index =0;
        int [] temp  =  new int[nums.length];
        for (int i = k; i <nums.length ; i++) {
            temp[index] = nums[i];
            index++;
        }
        for (int i = 0; i < k; i++) {
            temp[index] = nums[i];
            index++;

        }
        nums =temp;
        System.out.println("After Array = " + Arrays.toString(nums) + ", k = " + k);




    }
}
