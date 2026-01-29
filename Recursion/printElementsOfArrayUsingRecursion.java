import java.util.*;
public class printElementsOfArrayUsingRecursion {

    public static void rec(int num, int[] arr)
    {
        if ( num == arr.length) return;
        System.out.println(arr[num]);
        rec(num+1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rec(0, arr);
    }
}
