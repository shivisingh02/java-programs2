public class Palindrom {
    public static void main(String[] args) {
        String str = "shivi";
        String a ="";
        int max = 0;
        String s = "";
        Palindrom ob = new Palindrom();
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i + 1 ; j <= str.length() ; j++)
            {
                a = str.substring(i, j);
                StringBuilder ans = new StringBuilder(a);
                StringBuilder newWord = new StringBuilder();
                newWord.append(ans.reverse());
                String z =newWord.toString();
                System.out.println(z);
                if(z.equals(a) && max < a.length())
                {
                    max = a.length();
                    s = a;
                }
            }
            }
        System.out.println(s + "=" + max);
       
    }
    boolean ispalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i)!= str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
