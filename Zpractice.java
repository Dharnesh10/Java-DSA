import java.util.*;

class Zpractice {
    public static void main(String[] args) {
        boolean[][] mat = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[mat.length][mat[0].length];

        findPath("", 0, 0, mat, path, 1);
    }

    static void findPath(String p, int r, int c, boolean[][] mat, int[][] path, int step) {
        if (r == mat.length - 1 && c == mat[0].length - 1) { // if reached the end cell then print the path
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!mat[r][c]) {
            return;
        }

        // mark visited
        mat[r][c] = false;
        path[r][c] = step;

        // Down
        if (r < mat.length - 1) {
            findPath(p + 'D', r + 1, c, mat, path, step+1);
        }

        // Right
        if (c < mat[0].length - 1) {
            findPath(p + 'R', r, c + 1, mat, path, step+1);
        }

        // Up
        if (r > 0) {
            findPath(p + 'U', r - 1, c, mat, path, step+1);
        }

        // Left
        if (c > 0) {
            findPath(p + 'L', r, c - 1, mat, path, step+1);
        }

        //diagonal-right
        if (r < mat.length - 1 && c < mat[0].length - 1) {
            findPath(p + 'C', r + 1, c + 1, mat, path, step + 1);
        }

        // backtrack
        mat[r][c] = true;
        path[r][c] = 0;
    }
}