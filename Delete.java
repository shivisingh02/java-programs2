import java.util.Arrays;
import java.util.*;
public class Delete {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num[] = {12,43,24,34,56,65}; 
        System.out.println("enter number to search");
        int x = sc.nextInt();
        int k = -1;
        for(int i = 0 ; i < num.length ; i++)
        {
           if(num[i] == x)
           {
             k = i;
             for(int j = i ; j < num.length - 1 ; j++)
             {
                num[j] = num[j+1];
             }
             num[num.length - 1] = 0;
             break;
           }
        }
        if(k == -1)
        System.out.println("num not found");
        else
        System.out.println(Arrays.toString(num));
    }
}
