import java.util.*;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        Array ob = new Array();
        for(int i = 0 ; i < 2 ; i++){
            System.out.println("scores in week1");
            int j = sc.nextInt();
            int arr[] = ob.create(j);
               System.out.println(Arrays.toString(arr));
           
        }
       
    }

            int[] create(int j)
            {
                int score[] = new int[j];
                System.out.println("enter scores");
                for(int i = 0 ; i < j ; i++)
                {
                    score[i] = sc.nextInt();
                }
                return score;  
            }
    }

