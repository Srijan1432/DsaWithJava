import java.util.Scanner;

public class PrintNtoOne {

    public static void PrintNum(int num)
    {
        if ( num == 0 ) return;
        System.out.println( num );
        PrintNum( num-1 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter  a nnumber : " );
        int n = sc.nextInt();

        PrintNum(n);
    }    
}
