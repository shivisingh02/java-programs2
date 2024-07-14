import java.util.*;
public class check1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of term");
        int k = sc.nextInt();
        int arr[] = {1,35,32,56,87,98,53,24,6,3};
        for(int i = 0; i < arr.length -1; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(k + " smallest num = "+ arr[k-1]);
        System.out.println(k + " largest num = "+ arr[arr.length - k]);
    }
}
