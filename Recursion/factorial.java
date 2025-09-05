import java.util.Scanner;
public class factorial {

    public static int fact(int num)
    {
        if ( num == 1 ) return 1;
        int ans = num * fact( num-1 );
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter  a number: ");
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}
