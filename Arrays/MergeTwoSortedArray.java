public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {11,33,42,71};
        int[] brr = {26,54,69,81, 85, 94, 99};
        int m = arr.length;
        int n = brr.length;
        int[] crr = new int[m+n];
        int i = 0, j = 0, k = 0;

        while (i<m && j<n)
        {
            if(arr[i] <= brr[j])
            {
                crr[k] = arr[i];
                i++;
            }
            else{
                crr[k] = brr[j];
                j++;
            }
            k++;

            if (i == m)
            {
                while (j < n)
                {
                    crr[k] = brr[j];
                    j++; k++;
                }
            }
            if (j == n)
            {
                while (i < m)
                {
                    crr[k] = arr[i];
                    i++; k++;
                }
            }
        }

        for (int a=0; a<crr.length; a++)
        {
            System.out.print(crr[a]+ " ");
        }

    }
}
