import java.util.*;

public class Main {

    static int idx = 0;

    private static boolean isSafe(int row, int col, char[][] board, int n) {
        for (int j = 0; j < col; j++)
            if (board[row][j] == 'Q') return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row, j = col; i < n && j >= 0; i++, j--)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private static void solve(int col, String[][] ans, char[][] board, int n) {
        if (col == n) {
            for (int i = 0; i < n; i++) {
                ans[idx][i] = new String(board[i]);
            }
            idx++;
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, ans, board, n);
                board[row][col] = '.';
            }
        }
    }

    private static String[][] solveNQueens(int n) {
        idx = 0; // 🔹 IMPORTANT FIX

        String[][] ans = new String[n * n][n];
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, ans, board, n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        String[][] res = solveNQueens(n);

        for (String[] board : res) {
            if (board[0] == null) break;
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }

        sc.close();
    }
}
