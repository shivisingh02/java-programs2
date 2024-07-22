package COLLECTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArrays {
    public static void main(String[] args) {
     Integer arr[] = {1,2,3,12,43,56,76,89};
    Integer arr2[] = {2,3,4,5,6,7};
    merge2(arr, arr2);
    }
    public static void merge(Integer arr1[] , Integer arr2[])
    {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println(list1);
    }
    public static void merge2(Integer arr[] , Integer arr2[])
    {
        int i = 0 , j =  0 , k = 0;
        int[] ans = new int[arr.length+ arr2.length];
        while(i < arr.length && j < arr2.length)
        {
            if(arr[i] <= arr2[j])
            {
                ans[k++] = arr[i++];
            }
             else 
            {
            ans[k++] = arr2[j++];
            }
        }
        while(j < arr2.length)
        {
            ans[k++] = arr2[j++]; 
        }
        while(i < arr.length)
        {
            ans[k++] = arr[i++];
        }
        System.out.println(Arrays.toString(ans));
    }

    
}
