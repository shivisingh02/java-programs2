import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int num[] = {23,45,32,56,43,2};
        String str[] = {"Shivi" , "Saniya" , "Sakshi" , "sneha"};
        for(int i = 0 ; i < num.length - 1 ; i++)
        {
            for(int j = 0; j < num.length -1 ; j++)
            {
                if(num[j] > num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i < str.length -1 ; i++)
        {
            for(int j = 0 ; j < str.length - 1; j++)
            {
                if(str[j].compareTo(str[j+1]) > 0 )
                {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
       for(int i = 0 ; i < str.length ; i++)
       {
        System.out.print(str[i] + " ");
       }
       //average
       int sum = 0;
       for(int a:num)
       {
        sum = sum + a;
       }
       System.out.println("Average = "+ sum/num.length);
    }
}
