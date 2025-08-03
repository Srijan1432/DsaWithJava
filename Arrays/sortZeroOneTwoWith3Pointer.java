public class sortZeroOneTwoWith3Pointer {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high)
        {
            if (arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 2)
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else if (arr[mid] == 1)
            {
                mid++;
            }
        }

        


        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
