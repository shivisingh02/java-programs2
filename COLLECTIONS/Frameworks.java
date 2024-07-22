package COLLECTIONS;


import java.util.*;

public class Frameworks {
    public static void main(String[] args) {
    Integer arr[] = {1,2,34,3,53,422,43,34,4,544,23,2,4};
   max2(arr);
    DuplicateDelete(arr);
    rotate(arr, 2);
    }
    public static void max2(Integer arr[])
    {
        List<Integer> list = Arrays.asList(arr);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(list);
        System.out.println(maxHeap.poll() + " " + maxHeap.poll());
    }
    
    public static void DuplicateDelete(Integer arr[])
    {
    List <Integer> list = Arrays.asList(arr);
    Set <Integer> set = new HashSet<>(list);
    ArrayList <Integer> ans = new ArrayList<>(set); //convert into another data type to perform operations.
   // set.addAll(list);
    System.out.println(set);
    }

    public static void intersection(Integer arr1 , Integer arr2)
    {
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        Set <Integer> set1 = new HashSet<>(list1);
        Set <Integer> set2 = new HashSet<>(list2);
       //retainAll() in place operation
        set1.retainAll(set2); //set1 looses original value and only stores interseaction.
        System.out.println(set1);
    }
    public static void kSmallestElement(Integer arr[] , int k)
    {
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
    public static void rotate(Integer arr[] , int k )
    {
        List<Integer> list = Arrays.asList(arr);
        Collections.rotate(list, k);
        System.out.println(list);
    }
    
}
