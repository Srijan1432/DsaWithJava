import java.util.Scanner;

public class rollNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++)
        {
            if (arr[i] < 35)
            {
                System.out.println(i);
            }
        }
    }
}
