import java.util.Scanner;
public class Triangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side : ");
        int x1 = sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int x2 = sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int x3 = sc.nextInt();

        if ((x1 + x2) > x3 && (x2 + x3) > x1 && (x3 + x1) > x2)
        {
            System.out.println("Valid Traingle");
        }
        else
        {
            System.out.println("Not a valid Triangle.");
        }
    }
}
