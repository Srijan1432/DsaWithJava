import java.util.*;
public class fibonacciSeries {

    public static int fib(int num)
    {
        if ( num == 0 ) return 0;
        if ( num == 1 ) return 1;
        return fib( num-1 ) + fib( num-2 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term: ");
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}
