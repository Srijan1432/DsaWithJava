import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius: ");
        double r = sc.nextInt();
        double area;
        area = pi * r * r;
        System.out.println("Area of circle is : "+area);

    }
}
