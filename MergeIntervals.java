import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int num[][] = {{1,3} , {2 , 6} , {8,10} , {15 , 18}};
        for(int i = 0 ; i < num.length - 1 ; i++)
        {
            for(int j = i + 1 ; j < num.length ; j++)
            {
                if(num[i][1] == num[j][1])
                {
                    num[j][0] = num[i][0];
                    num[i][0] = 0;
                    num[i][1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
