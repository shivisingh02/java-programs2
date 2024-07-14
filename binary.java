class binary
{
    public static void main(String[] args) {
        int n = 1010;
        String str = Integer.toString(n);
        int a= 0;
        int k = str.length() -1;
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == '0')
            a = a + 1*(int)Math.pow(2, k);
            else
            a = a + 0*(int)Math.pow(2, k);
            k--;
        }
       System.out.println(a);
    }
}