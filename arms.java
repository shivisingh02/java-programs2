import java.util.*;
public class arms {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int s = sc.nextInt();
        int e = sc.nextInt();
        if(1<= s && s <= e && e <= 100000)
        {
           
            for(int i = s; i <= e ; i++)
            {
                int sum = 0; 
                int c = i;
                 while(c > 0)
                 {
                     int d = c%10;
                     sum = sum + (d*d*d);
                     c = c/10;
                 }
                 if( i == sum)
                 System.out.print(i + " , ");
            }
        }
        else 
        {
         System.out.println("Invalid input");
        System.exit(0);
        }
    }

    }
