import java.util.Scanner;
public class firstLastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40,50};
        int n = arr.length;
        int key = sc.nextInt();

        int fo = -1; int lo = -1;
        
        int low = 0; int high = n-1;
        
        boolean flag = false;
        while ( low <= high )
        {
            int mid = low + ( high - low ) / 2;
            if ( arr[mid] == key )
            {
                flag = true;
                break;
            }
            else if ( key < arr[mid] ) high = mid -1;
            else if ( key >= arr[mid] ) low = mid + 1;
        }
        if ( flag == false )
        {
            System.out.println( fo + " "+ lo);
            return;
        }

        low = 0; high = n-1;
        while ( low <= high )
        {
            int mid = low + ( high - low ) / 2 ;
            if ( arr[mid] >= key )
            {
                fo = mid;
                high = mid -1 ;
            }
            else low = mid + 1;
        }

        low = 0; high = n-1;
        while ( low <= high )
        {
            int mid = low + ( high - low ) / 2;
            if ( arr[mid] > key)
            {
                lo = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        System.out.print( fo +" "+ (lo - 1 ));

    }   
}
