import java.util.*;
public class reverseAnArray {

    public static void ans(int[] arr, int j, int i)
        {
            if ( i >= j ) return;
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            ans(arr, j-1, i+1);

        }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int j = arr.length-1;
        ans(arr, j, 0);

        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}
