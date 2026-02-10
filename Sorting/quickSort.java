import java.util.*;
public class quickSort {

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high )
    {
        int pivot = arr[low];

        int count = 0;
        for ( int i= low + 1 ; i <= high; i++ )
        {
            if ( arr[i] < pivot )
                count++;
        }

        int pIdx = low + count;
        swap(arr, low, pIdx);

        int i = low, j = high;

        while ( i < pIdx && j > pIdx )
        {
            while ( i < pIdx && arr[i] <= arr[pIdx]) i++;
                 
            while ( j > pIdx && arr[j] > arr[pIdx] ) j--;


            if ( i < pIdx && j > pIdx )
            {
                swap( arr, i, j );
                i++;
                j--;
            }
        }

        return pIdx;
    }

    public static void qSort(int[] arr, int low, int high)
    {
        if ( low >= high ) return;

        int p = partition( arr, low, high );

        qSort( arr, low, p-1 );
        qSort( arr, p+1, high );
    }
    
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3,3,3,3,4};
        int n = arr.length;

        qSort(arr, 0, n-1);

        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
