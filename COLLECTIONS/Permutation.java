package COLLECTIONS;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation 
{
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6};
        Integer arr2[] = {2,1,3, 3 ,4, 4,5,6};
        permutation(arr, arr2);
        System.out.println(permutation2(arr, arr2));
    }
    public static void permutation(Integer arr[] , Integer arr2[])
    {
        List<Integer> list1 = Arrays.asList(arr);
        Set <Integer> set1 = new HashSet<>(list1);
        List<Integer> list2 = Arrays.asList(arr2);
        Set <Integer> set2 = new HashSet<>(list2);
        Set <Integer> set3 = new HashSet<>(list1);
        Set <Integer> set4 = new HashSet<>(list2);
        set3.retainAll(set2);
        set4.retainAll(set1);
        if(set3.equals(set1) && set4.equals(set2))
        {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
    //2nd way 
    public static boolean permutation2(Integer arr[] , Integer arr2[])
    {
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(arr2);
        Collections.sort(list1); //O(nlogn) 
        Collections.sort(list2);
        return list1.equals(list2);
    }
}
