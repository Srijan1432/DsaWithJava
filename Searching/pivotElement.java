public class pivotElement {
    public static void main(String[] args) {
        int[] arr = {2,3,7,9,1};
        int n = arr.length;
        int low = 0, high = n-1, mid;

        while ( low <= high )
        {
            mid = low + ( high - low ) / 2;

            if ( arr[mid] > arr[high] )
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        System.out.println(arr[low]);
    }
}
