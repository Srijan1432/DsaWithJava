import java.util.Scanner;

class Square
{
    int count;
    int square;

    void printDigit(int num)
    {
        while (num != 0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Digit of Number: "+count);
    }

    void printSquare()
    {
        System.out.print("Square of Digit: "+ (count*count));
    }
}

public class CountNumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        Square s1 = new Square();
        s1.printDigit(n);
        s1.printSquare();
    }
}
