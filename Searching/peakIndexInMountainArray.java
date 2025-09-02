public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,20,4};
        int n = arr.length;
        int low = 0, high = n-1, mid;
        int peak = 0;

        while ( low <= high )
        {
            mid = low + ( high - low ) / 2 ;
            if ( arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1] )
            {
                peak = mid;
                break;
            }
            else if ( arr[mid] < arr[mid + 1] )
            {
                low = mid + 1;
            }
            else high = mid - 1;
        }
        System.out.println(peak);
    }
    
}
