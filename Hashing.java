import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        String str = "dsdjsdkghrgkeruthiu";
        int ans = lengthOfLongestSubstring(str);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String str)
    {
        String s [] = new String[10];
        HashSet<Character> list = new HashSet<>(); //hash set is a class
        int i = 0 , j = 0 , maxLen = 0 , start = 0 , end = 0;
        while(j < str.length())
        {
            char ch = str.charAt(j);
            if(!list.contains(ch))
            {
                list.add(ch);
                maxLen = Math.max(maxLen, j - i +1);
                j++;
                start = i ;
                end = j;
            }
            else
            {
               list.remove(str.charAt(j));
               i++;
            }
        }
        System.out.println(str.substring(start, end));
        return maxLen;
    }
}
