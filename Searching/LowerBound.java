
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,4,50,60,70};
        int n = arr.length;
        int low = 0; int high = n-1; int mid;
        int x = 25;

        int lb = arr.length;
        while (low <= high)
        {
            mid = (high + low) / 2;
            if ( arr[mid] >= x )
            {
                lb = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        System.out.println(lb);
    }    
}
