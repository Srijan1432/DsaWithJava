import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,5,2,1,8,9};
        int n = arr.length;

        for (int i=0; i<n-1; i++)
        {
            int j = i+1;
            while ( j>0 && arr[j] < arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
