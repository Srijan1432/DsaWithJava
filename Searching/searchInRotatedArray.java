public class searchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int n = arr.length;
        int low = 0, high = n - 1, mid;
        int target = 3;

        int index = -1;

        while ( low <= high )
        {
            mid = low + ( high - low ) / 2 ;
            if ( arr[mid] == target )
            {
                index = mid;
                break;
            }
            else if ( arr[mid] >= arr[n-1] )
            {
                if ( arr[mid] >= target )
                {
                    low = mid + 1;
                }
                else high = mid - 1;
            }
            else if ( arr[mid] <= arr[n-1] )
            {
                if ( arr[mid] >= target )
                {
                    high = mid - 1 ;
                }
                else low = mid + 1;
            }
        }

        System.out.println(index);
    }
}
