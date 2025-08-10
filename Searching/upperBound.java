public class upperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int ub = n;
        int low = 0; int high = n-1;
        int key = 30;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] > key)
            {
                ub = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        System.out.println(ub);
    }
}
