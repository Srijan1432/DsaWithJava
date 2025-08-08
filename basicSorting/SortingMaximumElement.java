public class SortingMaximumElement {
    public static void main(String[] args) {
        int[] arr = {12,3,45,33,4,6,47,1};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int pos = n - 1 - i; 
            int maxIndex = 0;
            for (int j = 1; j <= pos; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
