public class selectionSorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;

        for (int i=0; i<n-1; i++)
        {
            int index = i;
            for (int j=i+1; j<n; j++)
            {
                if (arr[j] < arr[index])
                {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
