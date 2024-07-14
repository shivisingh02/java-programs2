import java.util.*;
public class mul {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size 1");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("enter size 2");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m1][n1];
        System.out.println("enter the elements");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < m1 ; i++)
        {
            for(int j = 0; j < n1 ; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
       if(n == m1)
       {
        int arr3[][] = new int[m][n1];
        for(int i = 0 ; i < m ; i++)
        {
            
            for(int j = 0 ; j < n1 ; j++)
            {
                int sum = 0;
              for(int k = 0; k < n ; k++)
              { 
                 sum = arr1[i][k] * arr2[k][j] + sum;
              }
              arr3[i][j] = sum;
            }
        }
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n1 ; j++)
            {
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
        
       }

    }
    
}
