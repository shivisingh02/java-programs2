import java.util.*;
public class Diamond {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the num of rows");
      int k = sc.nextInt();
      pattern(k);
    }
    static void pattern(int n)
    {

        for( int i = 1 ; i<= n ; i++)
        {
            for(int space = 1; space <= n - i; space++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i -1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int  i = n-1 ; i >= 1; i--)
        {
            for(int space = n-i; space >= 1; space--)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i -1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i < n ; i++)
        {
            for(int j = 1; j <= n-i ; j++ )
            System.out.print("*");
            System.out.println();
        }
        for(int i = n-2 ; i >=1 ; i--)
        {
            for(int j = 1; j <= n-i ; j++ )
            System.out.print("*");
            System.out.println();
        }
        int k;
        for( int i = 1 ; i<= n ; i++)
        {
             k = 1;
            for(int space = 1; space <= n - i; space++)
            {
                System.out.print(" ");
            }
           
            for(int j = 1; j <= 2*i -1 ; j++)
            {
               if(j <= n)
               {
               System.out.print(k);
               k++;
               }
              else
               {
                k--;
               System.out.print(k);
               }
            }
            System.out.println();
        }
    }
}
