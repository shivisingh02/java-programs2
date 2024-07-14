import java.util.*;
public class fib {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int k = sc.nextInt();
        System.out.println("enter first two terms");
        int f = sc.nextInt();
        int s = sc.nextInt();
        if(1<=k && k<= 10 && (1<= f && f <= s && s <= 100))
        {
            System.out.print(f + " , "+ s);
            int sum = f + s;
            for(int i = 1; i <= k ; i++)
            {
                int c = f + s;
                sum = sum + c;
                System.out.println(" , " + c);
                f = s;
                s = c;
            }
            System.out.print("Sum = "+ sum);

        }
        else 
        {
            System.out.println("Invalid input");
        System.exit(0);
        }

    }   
}
