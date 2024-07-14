import java.util.Scanner;

public class rev3 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        str = str + " ";
        String a="";
        String s = "";
        for(int i = 0 ; i < str.length() ; i++) 
        {
            char ch = str.charAt(i);
            if(ch == ' ')
            {
                s = s+ " " + a;
                a = "";
            }
            else 
            {
                a = ch+a; 
            }
        }
        System.out.println(s);
    }
}
