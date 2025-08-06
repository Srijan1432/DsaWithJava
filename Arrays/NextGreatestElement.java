public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,60,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        int mx = arr[n-1];
        for (int i=n-2; i>=0; i--)
        {
            ans[i] = mx;
            mx = Math.max(mx, arr[i]);
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(ans[i]+ " ");
        }
    }
}
