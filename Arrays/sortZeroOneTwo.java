public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        int noz = 0;
        int noo = 0;
        int not = 0;

        for (int i=0; i<n; i++)
        {
            if(arr[i] == 0) noz++;
            else if (arr[i] == 1) noo++;
            else not++;
        }

        for (int i=0; i<n; i++)
        {
            if (i < noz) arr[i] = 0;
            else if (i >= noz && i < noz+noo) arr[i] = 1;
            else arr[i] = 2;
        }

        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
