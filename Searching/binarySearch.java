import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,15,21,34,81,105,180,500,614};
        int n = arr.length;
        System.out.print("Enter target : ");
        int key = sc.nextInt();

        int low = 0; int high = n-1; int mid;

        boolean flag = false;
        while (low <= high)
        {
            mid = (low + high ) / 2;
            if (arr[mid] == key)
            {
                flag = true;
                break;
            }
            else if (key < arr[mid] )
            {
                high = mid - 1;
            }
            else if (key > arr[mid] )
            {
                low = mid + 1;
            }
        }
        if (flag == false) System.out.println("Not Found");
        else System.out.println("Found at index : "+ );
    }    
}
