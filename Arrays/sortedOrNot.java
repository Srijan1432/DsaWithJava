public class sortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,4,7,6,10,12};
        boolean flag = true;
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                flag = false;
                break;
            }
        }
        if (flag == true)
        {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
