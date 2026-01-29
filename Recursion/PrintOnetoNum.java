import java.util.Scanner;

public class PrintOnetoNum {

    public static void print(int num, int k)
    {
        if (num > k) return;
        System.out.println(num);
        print(num+1, k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter a number : " );
        int n = sc.nextInt();

        int x = 1;
        
        print(x, n);
    }
}
