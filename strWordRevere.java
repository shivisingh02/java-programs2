public class strWordRevere {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(wordReverse(str));
    }
    public static String wordReverse(String str){
        String words[] = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word: words)
        {
            StringBuilder newWord = new StringBuilder(word); //stringbuilder makes immutable objects
            ans.append(newWord.reverse().toString()).append(" ");
            //reverse is standard function return reference
        }
        return ans.toString().trim();
    }
}
