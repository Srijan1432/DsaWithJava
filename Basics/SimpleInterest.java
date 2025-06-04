import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        double p = sc.nextInt();
        System.out.print("Enter rate : ");
        double r = sc.nextInt();
        System.out.print("Enter year : ");
        double t = sc.nextInt();

        double si = (p*r*t) / 100;
        System.out.print("Simple Interest : "+si);
    }
}
