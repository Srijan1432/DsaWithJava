import java.util.*;
public class stairsPath {

    public static int stairs(int num)
    {
        if ( num == 1 || num == 2) return num;
        return stairs(num-1) + stairs(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(stairs(n));
    }
}
