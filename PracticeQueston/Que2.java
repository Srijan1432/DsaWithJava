import java.util.Scanner;
public class Que2 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,11,13,17};
        int key = 17;
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key )
            {
                System.out.println(arr[mid]);
                break;
            }
            else if (key < arr[mid] )
            {
                high = mid-1;
            }
            else if (key > arr[mid])
            {
                low = mid+1;
            }
        }
        System.out.println(arr[mid]);
    }
}
