import java.util.Scanner;

public class rotation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of rotations");
        int k = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7};
        for(int i = 0 ; i < k; i++)
        {
            int temp = arr[6];
            for(int j = 6; j > 0 ; j--)
        {
            arr[j] = arr[j-1];
        }        
       arr[0] = temp; 
    }
    for(int i = 0 ; i < 7 ; i++)
    System.out.print(arr[i] + " ");
    }
}
