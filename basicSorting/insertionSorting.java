public class insertionSorting {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        int n = arr.length;

        for (int i=0; i<n-1; i++)
        {
            for (int j=i+1; j>0; j--)
            {
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
