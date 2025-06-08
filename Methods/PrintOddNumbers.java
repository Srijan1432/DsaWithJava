import java.util.Scanner;

class OddNumber
{
    void print(int a ,int b)
    {
        for (int i=a; i<=b; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int y = sc.nextInt();

        OddNumber n1 = new OddNumber();
        n1.print(x,y);
    }
}
