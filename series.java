import java.util.*;
public class series
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of terms");
        int k = sc.nextInt();
        int sum = 0;
        int arr[] = new int[k];
        series ob = new series();
        System.out.print("1,");
        arr[0] = 1;
        for(int i = 1, j= 2; i < k ; j++,i++)
        {
           int term = (int)Math.pow(i , j) + i; 
           System.out.print(term+ ",");
           arr[i] = term;
           if(ob.isEven(term))
           {
            sum = sum + term;
           }
        }
        System.out.println();
        System.out.println("sum =" + sum);
        for(int i = 0 ; i <k ; i++)
        System.out.println(arr[i]);
        for(int i = 0; i < k ; i++)
        {
            if(ob.fact(arr[i]) == arr[k-1] && ob.fact(arr[k-1]) == arr[i])
                        {
              System.out.println(arr[i] + " " + arr[k]);
                        }
                       
        }
        if(ob.fact(284) == 220 && ob.fact(220) == 284)
        System.out.println("true");
    }
    boolean isEven(int n)
    {
        if(n%2 == 0)
        return true;
        else 
        return false;
    }
    int fact(int n)
    {
        int sum = 0;
        for(int i = 1 ; i <= n-1 ; i++)
        {
             if(n % i == 0)
             sum = sum + i;
        }
        return sum;
    }
}