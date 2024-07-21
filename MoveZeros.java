import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args)
    {
        int num[] = {2,1,0,0,3,4};
        int a[] = new int[num.length];
        int i = 0 , j = 0;
        while(i < num.length)
        {
            if(num[i] == 0)
            i++;
            else
            a[j++] = num[i++]; 
        }
        while(j < a.length)
        {
            a[j++]  = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
