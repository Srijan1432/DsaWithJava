public class optimizedBubbleSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        int n = arr.length;
        
        for (int i=0; i<n-1; i++)
        {
            boolean flag = true;
            for (int j=0; j<n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag == true) break;
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
