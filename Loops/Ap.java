import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter difference: ");
        int d = sc.nextInt();

        int nt = a + (n - 1) * d;

        for (int i=a; i<=nt; i+=d)
        {
            System.out.println(i);
        }
    }
}
