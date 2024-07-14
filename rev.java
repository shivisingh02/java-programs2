import java.util.*;
public class rev {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        String a ="";
        for(int i = str.length() -1 ; i>= 0 ; i--)
        {
            char ch = str.charAt(i);
            a = a + ch;
        }
        System.out.println(a);
    }
}
