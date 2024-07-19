import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args)
    {
        String str = "Shhhiiivi";
        String str2 = "Abhishek";
       HashSet<Character> list1 = new HashSet<>();
       HashSet<Character> list2 = new HashSet<>();
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch2 = str.charAt(i);
            for(int j = i+1 ; j < str.length() ; j++)
            {
                char ch1 = str.charAt(j);
                if(ch2 == ch1)
                {
                   list1.add(ch1);
                }
            }
        }
        for(int i = 0 ; i < str2.length() ; i++)
        {
            char ch2 = str2.charAt(i);
            for(int j = i+1 ; j < str2.length() ; j++)
            {
                char ch1 = str2.charAt(j);
                if(ch2 == ch1)
                {
                   list2.add(ch1);
                }
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        list1.retainAll(list2);
        System.out.println(list1);

    }
}
