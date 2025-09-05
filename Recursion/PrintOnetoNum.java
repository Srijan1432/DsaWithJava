import java.util.Scanner;

public class PrintOnetoNum {

    public static void print(int a, int num)
    {
        if ( a > num ) return;
        System.out.println( a );
        print( a+1 , num ); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter a number : " );
        int n = sc.nextInt();
        int a = 1;

        print(a,n);
    }
}
