import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element for search: ");
        int key = sc.nextInt();
        boolean flag = false;
        for (int i=0; i<n; i++)
        {
            if (arr[i] == key)
            {
                flag = true;
                System.out.println("Element found at index: "+ i);
                break;
            }
        }
        if (flag == false)
        {
            System.out.println("element not found");
        }
        
    }
}
