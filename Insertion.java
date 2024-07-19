import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num[] = {12,43,24,34,56,6};
        int min = num[0];
        int max = num[0];
        int a[] = new int[num.length + 2];
        int k = 0 , i , k1 = 0;
        for( i = 1 ; i < num.length ; i++)
        {
            if(min > num[i])
            {
                min = num[i];
                k = i;
            }
            if(max < num[i])
            {
                max = num[i];
                k1 = i;
            }
        }
        int j = 0;
        System.out.println("enter value to insert");
        int x = sc.nextInt();
        for(i = 0 ; i < num.length ;)
           {
            if(k == i)
            {
                a[j++] = num[i++];
                a[j++] = x;
            }
            else if(i == k1)
            {
                a[j++] = num[i++];
                a[j++] = x;
            }
            else
            a[j++] = num[i++];
        }
        System.out.println(Arrays.toString(a));
    }
}