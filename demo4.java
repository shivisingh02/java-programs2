import java.util.*;
public class demo4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
     int arr[] = new int[n];
        System.out.println("numbers");
        for(int i = 0 ; i < n ; i++)
        {
arr[i]  = sc.nextInt();
        }
        int flag = 0;
        for(int i = 0; i < n - 1 ; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i]< arr[j])
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            System.out.print(arr[i] + " , ");
            flag = 0;

        }
    }
    
}
