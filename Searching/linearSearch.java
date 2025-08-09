public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10,15,21,34,81,105,180,500};
        int n = arr.length;
        int key = 105;

        boolean flag = false;
        for (int i=0; i<n; i++)
        {
            if (arr[i] == key)
            {   
                flag = true;
                System.out.println("Found at index "+ i);
                break;
            }    
        }

        if (flag == false)
        {
            System.out.print("Not Found.");
        }
    }
}
