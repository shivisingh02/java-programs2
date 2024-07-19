public class Demo1 {
    public static void main(String[] args) {
        double num = 123.65;
        String str = Double.toString(num);
        int i = 0;
        while(i < str.length())
        {
            char ch = str.charAt(i);
            if(ch == '.')
            break;
            System.out.print(ch);
            i++;
        }
        System.out.println();
   while(i < str.length())
   {
     System.out.print(str.charAt(i));
     i++;
   }
//    Practice practice = new Practice(); 
        
    }
    
}
// class Practice{
//      double decimalPart(double num)
//      {
        
//      }
// }
