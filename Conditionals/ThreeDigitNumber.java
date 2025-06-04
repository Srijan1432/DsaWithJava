import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        if (n > 99 && n < 1000)
        {
            System.out.print("Three Digit Number");
        }
        else
        {
            System.out.print("Not a three digit number");
        }
    }    
}
