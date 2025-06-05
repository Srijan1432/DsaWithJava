import java.util.Scanner;

public class Ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a=4;
        for (int i=0; i<=n; i++)
        {
            System.out.println(a);
            a = a + 3;
        }
    }
}
