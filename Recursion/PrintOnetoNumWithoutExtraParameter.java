import java.util.Scanner;

public class PrintOnetoNumWithoutExtraParameter {

    public static void print(int num)
    {
        if ( num == 0 ) return;
        print( num - 1 );
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter a number : " );
        int n = sc.nextInt();

        print(n);
    }
}
