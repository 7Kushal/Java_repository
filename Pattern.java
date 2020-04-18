import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n in next line ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i= n;i>=1;i--) {
            for (int j = n; j >= 1; j = j - 1) {
                if(j>i)
                System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
