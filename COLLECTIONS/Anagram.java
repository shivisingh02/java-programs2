package COLLECTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
     public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));
     }

     public static boolean isAnagram(String str1 , String str2)
     {
        if(str1.length() != str2.length())
        return false;
        List<Character> list1 = new ArrayList<>() ;
        char arr1[] = str1.toCharArray();
        for(char ch: arr1)
        {
            list1.add(ch);
        }
        List<Character> list2 = new ArrayList<>( ) ;
        char arr2[] = str2.toCharArray();
        for(char ch: arr2)
        {
            list2.add(ch);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1 + " " + list2);
        return list1.equals(list2);
     }
}
