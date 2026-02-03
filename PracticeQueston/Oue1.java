import java.util.Scanner;
public class Oue1 {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,-2,-1};
        int n = arr.length;
        int[] ans = new int [4];
        ans[0] = arr[0];
        for (int i=1; i<n; i++)
        {
            ans[i] = Math.max(arr[i], arr[i-1]);
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(ans[i]);
        }
    }
    
}

