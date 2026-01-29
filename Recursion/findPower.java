import java.util.*;
public class findPower {

    public static int pow(int a, int b)
    {
        if ( b == 0) return 1;
        return a * pow (a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Power: ");
        int y = sc.nextInt();

        System.out.println(pow(x,y));
    }
}
