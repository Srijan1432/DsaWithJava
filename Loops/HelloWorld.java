import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++)
        {
            System.out.println("Hello world..!!");
        }
    }
}
