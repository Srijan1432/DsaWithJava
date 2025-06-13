import java.util.Scanner;

public class Combination {

    public static int factorial(int n)
    {
        int fact = 1;
        for (int i=1; i<=n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static int comb(int n, int r, int nr)
    {
        int ans = n / (r * nr);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int r = sc.nextInt();
        
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r); 

        int result = comb(nFact, rFact, nrFact);
        System.out.println(result);

    }
}
