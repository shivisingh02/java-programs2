import java.util.Scanner;

public class MinSteps {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(steps(n));
    }
    public static int steps(int n)
    {
        if(n==1)
        {
            return 0;
        }
        int a = Integer.MAX_VALUE , b = Integer.MAX_VALUE , c = Integer.MAX_VALUE;
        if(n%2==0)
        a =  1 + steps(n/2);
        if(n%3 == 0)
        b =  1 + steps(n/3);
        else
        c = 1 + steps(n-1);

        return Math.min(a , Math.min(b , c));
  }
}
