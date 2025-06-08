package Methods;
import java.util.Scanner;

class Circle{
    double res;

    double Area(double radius)
    {
        res = 3.14 * radius * radius;
        return res;
    }
}


public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();

        Circle c1 = new Circle();
        double area = c1.Area(r);
        System.out.println("Area of Circle : "+area);
    }
}
