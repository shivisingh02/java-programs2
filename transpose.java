import java.util.*;
public class transpose {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the elements");
        for(int i = 0 ;i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int arr2[][] = new int[n][m];
        for(int i = 0 ;i < m ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                arr2[j][i] = arr[i][j];
            }
    }
    for(int i = 0 ;i < n ; i++)
    {
        for(int j = 0; j < m ; j++)
        {
            System.out.print(arr2[i][j] + " ");
        }
        System.out.println();
    }   
    
}
}
