import java.util.*;
public class printZigZag {

    public static void ans(int num)
    {
        if (num == 0) return;
        System.out.print(num);
        ans(num-1);
        System.out.print(num);
        ans(num-1);
        System.out.print(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();

        ans(n);
    }
}
