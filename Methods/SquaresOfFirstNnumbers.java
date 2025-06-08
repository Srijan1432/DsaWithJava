import java.util.Scanner;

class Square
{
    void sq(int n)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.println(i*i);
        }
    }
}

public class SquaresOfFirstNnumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        Square s1 = new Square();
        s1.sq(n);
    }

}
