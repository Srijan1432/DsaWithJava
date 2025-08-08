public class pushZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;

        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if (arr[j] == 0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
