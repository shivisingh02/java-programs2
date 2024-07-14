import java.util.*;
public class demo2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        char ch[] = {'I' , 'V' , 'X' , 'L' , 'C' , 'D', 'M'};
        int num[] = {1,5,10,50,100,500,1000};
int sum = 0;
        for(int i = 0 ; i < str.length(); i++) 
        {
            char ch1  = str.charAt(i);

            for(int j = 0 ;j < 7 ; j++)
            {
                if(ch1 == ch[j])
                {
                    sum  = num[j] + sum;
                }
            }

        } 
        System.out.println(sum); 
    }
}
