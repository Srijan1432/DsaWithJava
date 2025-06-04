import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp : ");
        int cp = sc.nextInt();
        System.out.print("Enter sp : ");
        int sp = sc.nextInt();

        if (sp > cp)
        {
            System.out.print(sp-cp + " Profit");
        }
        else
        {
            System.out.print(cp-sp + " Loss");
        }
    }    
}
