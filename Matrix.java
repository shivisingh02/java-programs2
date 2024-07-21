import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the size");
         int len = sc.nextInt();
         int matrix[][] = new int[len][len];
         System.out.println("Enter elements");
         for(int i = 0 ; i < len ; i++)
        {
            for(int j = 0 ; j < len ; j++)
            {
              matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] mat)
    {
        int sum = 0;
        int len = mat.length;
        for(int i = 0 ; i < len ; i++)
        {
            for(int j = 0 ; j < len ; j++)
            {
                if( i==j || i==0 && j == len -1 || j== 0  && i == len -1 || i+j == len - 1 )
                {
                    sum = sum + mat[i][j];
                }
            }
        }
        if(len % 2 != 0)
        sum = sum + mat[len / 2][len / 2];
        return sum;
    }
}
