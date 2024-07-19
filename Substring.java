public class Substring {
    public static void main(String[] args) {
        String str = "efjkefherheth";
        int max = 0;
        String a= "";
        String s = "";
        for(int i = 0 ; i < str.length() ; i++)
        { 
            char ch = str.charAt(i);
            if(a.indexOf(ch) < 0)
            {
                a = a+ch;
            }
            else
            {
                if(max < a.length())
                {
                max = a.length();
                s = a;
                }
                a = a.substring(a.indexOf(ch) + 1) + ch;
            }
            if(max < a.length())
            {
                max = a.length();
                s = a;
            }
        }
        System.out.println(s + " " + max);
    }
}
