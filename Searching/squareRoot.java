public class squareRoot {
    public static void main(String[] args) {
        int num = 8;
        int low = 0, high = num, mid;
        double ans = 0;

        while ( low <= high )
        {
            mid = low + ( high - low ) / 2 ;
            if ( (mid * mid) == num)
            {
                ans = mid;
                break;
            }
            else if ( (mid*mid) > num )
            {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        System.out.println(ans);
    }
}
