import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter difference: ");
        int d = sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            System.out.println(a);
            a = a * d;
        }
    }
}
