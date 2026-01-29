import java.util.*;
public class ratInMaze {

    public static int maze(int row, int col, int m, int n)
    {
        if (row > m || col > n) return 0;
        if (row == m || col == n) return 1;
        int right = maze(row+1, col, m, n);
        int down = maze(row, col+1, m, n);
        return (right + down);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(maze(1,1, m,n));
    }
}
