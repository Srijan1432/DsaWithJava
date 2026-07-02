import java.util.*;
public class first {

    public static class car{
        int price;
        int speed;
        int seats;

        void print()
        {
            System.out.println(price + " "+ speed + " "+ seats);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        car s = new car();
        s.price = 100000;
        s.speed = 200;
        s.seats = 4;
        s.print();

    }
}