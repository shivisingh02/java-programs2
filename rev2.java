import java.util.*;
public class rev2 {
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
                s = a + " " + s;
                a = "";
            }
            else 
            {
                a = a+ ch; 
            }
        }
        System.out.println(s);
    }
}
