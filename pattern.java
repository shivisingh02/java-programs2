import java.util.Scanner;

public class pattern {
      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter vowel to print");
        char ch = sc.next().charAt(0);
        int n;
        switch(ch)
        {
            case 'A':n = 6;

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n / 2; j++) {
                    if ((j == 0 || j == n / 2) && i != 0 ||
                        i == 0 && j != 0 && j != n / 2 ||
                        i == n/ 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            break;
            case 'E': n = 6; 
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == 0 || i == n-1 || i == n/2 || j == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            break;
            case 'I':  n = 6; 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            break;
            case 'O':   n = 6; 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            break;
            case 'U':  n = 6; 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((j == 0 || j == n - 1) || (i == n - 1 && j > 0 && j < n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            break;
            default: System.out.println("Invalid input");
        }

        }

    }

