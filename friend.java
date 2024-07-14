import java.util.*;
public class friend {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        friend ob = new friend();
        double avg1 = ob.sum(num1) / num1;
        double avg2 = ob.sum(num2) / num2;
        if(avg1 == avg2)
        {
            System.out.println("num friendly");
        }
        else
        System.out.println("num not friendly");
    }
    int sum(int n)
    {
        int s = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            if( n % i == 0)
            {
            s = s + i;
            System.out.println(i);
            }
        }
        return s;
    }
}
