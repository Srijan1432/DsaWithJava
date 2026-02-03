import java.util.Scanner;
public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,-7,-4};
        int n = arr.length;

        int ans = Integer.MIN_VALUE;
        int s = 0;
        for (int i=0; i<n; i++)
        {
            s = s+arr[i];
            if (s<0) s = 0;
            ans = Math.max(ans, s);

        }
        System.out.println(ans);

    }
}
