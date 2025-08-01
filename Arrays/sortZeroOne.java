public class sortZeroOne {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0};
        int n = arr.length;
     //  Mehod 1...
        // int count = 0;
        // for (int i=0; i<n; i++)
        // {
        //     if(arr[i] == 0) count++;
        // }

        // for (int i=0; i<n; i++)
        // {
        //     if(i < count) arr[i] = 0;
        //     else arr[i] = 1;
        // }

    // Method 2......

        int i = 0;
        int j = n-1;
        while (i<j)
        {
            if (arr[i] == 0)
            {
                i++;
            }
            else if (arr[j] == 1)
            {
                j--;
            }
            else if(arr[i]==1 && arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }

        for (int k=0; k<n; k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
