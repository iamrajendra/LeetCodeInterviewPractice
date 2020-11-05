import java.util.*;

public class RemoveRepeated {
    public static void main(String[] args) {
       int [] arr =  new int[]{1,1,2};

int remove  =  removeDuplicates(arr);
        System.out.println(remove);


    }

    public static  int removeDuplicates(int[]arr) {
        Set<Integer> set  = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        arr = new int[set.size()];
        List<Integer> a  = new ArrayList<>(set);
        for (int i = 0; i < a.size(); i++) {
            arr[i]  = a.get(i);
        }

        return set.size();



    }
}
