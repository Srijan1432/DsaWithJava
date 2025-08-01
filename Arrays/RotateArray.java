public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int k = 3;
        int n = arr.length;

        swap(arr, 0, n-k-1);
        swap(arr, n-k,n-1);
        swap(arr, 0, n-1);

        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void swap(int[] arr, int i, int j)
    {
        while(i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
