public class firstLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40,50};
        int n = arr.length;
        int key = 20;

        int low = 0; int high = n-1;
        int fo = 0; int lo =0;

        while (low <= high)
        {
            int mid = low + (high - low ) / 2;
            if ( arr[mid] >= key )
            {
                fo = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        low = 0; high = n-1;
        while ( low <= high )
        {
            int mid = low + ( high - low ) / 2;
            if ( arr[mid] > key )
            {
                lo = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        System.out.println(fo +" "+ (lo - 1) );
    }
}
