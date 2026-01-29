import java.util.*;
public class powerInLogN {

    public static int pow(int a, int b)
    {
        if (b == 0) return 1;
        int ans = pow (a, b/2);
        if (b % 2 == 0 ) return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(pow(x,y));
    }
}
