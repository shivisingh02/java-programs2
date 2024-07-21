import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubArray {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter nums");
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter size of subarray");
        int k = sc.nextInt();
        System.out.println(maximumSum(arr, k));
     }

    public static int maximumSum(int num[] , int k)
    {
        int i = 0 , j = 0;
        int sum = 0 , maxSum = 0 ;
        HashSet<Integer> list = new HashSet<>();
        while(j < num.length)
        {
            if(!list.contains(num[j]))
            {
            //    sum = sum + num[j];
               list.add(num[j]);
               if(j - i + 1 == k)
               {
                maxSum = Math.max(maxSum , sum);
                list.remove(num[i]);
                sum = sum - num[i];
                i++;
               }
            }
               else
               {
                i = j;
                sum = num[j];
                list.clear();
                list.add(num[j]);
               }
               j++;

            }
        return maxSum;
    }
}
