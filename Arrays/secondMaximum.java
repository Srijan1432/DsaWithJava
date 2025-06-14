import java.util.Scanner;

public class secondMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i=0; i<n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum: "+ max);

        int smax = arr[0];
        for (int i=0; i<n; i++)
        {
            if (arr[i] != max)
            {
                if (arr[i] > smax)
                {
                    smax = arr[i];
                }
            }
        }
        System.out.println("Second Maximum: "+ smax);
    }
}
