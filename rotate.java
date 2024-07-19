import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
    int nums[] = {1,2,3,4,5,6,7};
    int k = 3;
    int a[] = new int[nums.length];
        int j;
        for(int i = 0; i < nums.length; i++)
        { 
            j = i + k;
            if(j >= nums.length)
            {
                j = j - nums.length;
                a[j] = nums[i];
            }
            else
                a[j] = nums[i]; 
        }
        System.out.println(Arrays.toString(a));
}
}