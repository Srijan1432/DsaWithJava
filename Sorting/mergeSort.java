import java.util.*;
public class mergeSort {

    public static void merge(int[] arr, int low, int mid, int high)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high)
        {
            if (arr[left] <= arr[right])
            {
                ans.add(arr[left]);
                left++;
            }
            else{
                ans.add(arr[right]);
                right++;
            }
        }
        while (left <= mid)
        {
            ans.add(arr[left]);
            left++;
        }

        while (right <= high)
        {
            ans.add(arr[right]);
            right++;
        }

        for (int i=low; i<=high; i++)
        {
            arr[i] = ans.get(i-low);
        }
    }

    public static void divide(int[] arr, int low, int high)
    {
        if (low >= high) return;

        int mid = low + ( high - low ) / 2;
        divide (arr, low, mid);
        divide (arr, mid+1, high);

        merge (arr, low, mid, high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
        int n = arr.length;

        int low = 0;
        int high = n-1;

        divide(arr, low, high);

        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
