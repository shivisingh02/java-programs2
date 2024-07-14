import java.util.*;
public class demo3{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter numbers");
    for(int i = 0; i < n ; i++)
    arr[i] = sc.nextInt();
   int sum = 0; 
    for(int i = 0 ; i < n; i++)
    {
       for(int j = i +1 ; j < n; j++)
       {
        sum = sum + arr[j];
       }
       if(arr[i] > sum)
       System.out.print(arr[i] + " , ");
sum = 0;

    }
} 
    
}
