import java.util.*;
public class stairsOneThree {

    public static int Stairs(int num)
    {
        if ( num == 1 || num == 2) return 1;
        if ( num == 3 ) return 2;
        return Stairs(num-1) + Stairs(num-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(Stairs(n));
    }
}
