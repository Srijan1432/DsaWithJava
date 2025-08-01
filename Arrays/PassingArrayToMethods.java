import java.util.Scanner;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] sri)
    {
        sri[0] = 45;
    }
}


