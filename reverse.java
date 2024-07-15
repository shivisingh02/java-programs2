import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < n ; i++)
        {
          num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int start = 0; 
        int end = n-1;
        if(start >= end)
        {
            System.out.println("list empty");
            System.exit(0);
        }
        for(; start < end ; start++ , end--)
        {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
