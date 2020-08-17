package HackerRankProblems;

import java.util.*;

public class ArrayGame {


    private static boolean isSolvable(int start,int leap, int[] game) {

        if (start < 0 || game[start] == 1) return false;
        if ((start == game.length - 1) || start + leap > game.length - 1) return true;
        game[start] = 1;
        return isSolvable(start+1,leap,game) || isSolvable(start-1,leap,game) || isSolvable(start+leap,leap,game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (isSolvable(0,leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
