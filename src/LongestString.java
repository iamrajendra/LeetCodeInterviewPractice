import java.util.*;

public class LongestString {
    public static void main(String[] args) {

        String s = " ";
        System.out.println("args = " +lengthOfLongestSubstring(s));


    }

    public static Boolean areDistinct(String str,
                                      int i, int j)
    {

        // Note : Default values in visited are false
        boolean[] visited = new boolean[127];


        for(int k = i; k <= j; k++)
        {

            if (visited[str.charAt(k) - ' '] == true)
                return false;

            visited[str.charAt(k) - ' '] = true;
        }
        return true;
    }

    // Returns length of the longest substring
// with all distinct characters.
    public static int lengthOfLongestSubstring(String str)
    {
        int n = str.length();

        // Result
        int res = 0;

        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);

        return res;
    }
}
