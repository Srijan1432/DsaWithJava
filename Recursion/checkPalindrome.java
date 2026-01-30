import java.util.*;
public class checkPalindrome {

    public static boolean ans(String str, int i, int n)
    {
        if ( i >= n/2 ) return true;
        if ( str.charAt(i) != str.charAt(n-i-1)) return false;
        return ans(str,i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(ans(s, 0, n));
    }
}
