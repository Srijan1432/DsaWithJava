import java.util.*;
public class printSumOneToN {

    public static int sum(int num){
        if (num == 1) return 1;
        return num + sum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
