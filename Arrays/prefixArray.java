import java.util.Scanner;

public class prefixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Array size: ");
        int[] orgArr = {1,2,3,4,5};
        int n = orgArr.length;
        int[] arr = new int[5];
        arr[0] = orgArr[0];

        for (int i=1; i<n; i++)
        {
            arr[i] = arr[i-1] + orgArr[i];
        }

        for (int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}