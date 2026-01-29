import java.util.*;
public class allSetsOfString {

    public static void print(int size, String str, String ans)
    {
        if (size == str.length())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(size);
        print(size+1, str, ans+ch);
        print(size+1, str, ans);


    }
    public static void main(String[] args) {
        String s = "abcd";

        print(0, s, "");
    }
}
