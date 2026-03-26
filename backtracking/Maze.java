class Maze {
    public static void main(String[] args) {
        System.out.println("No of ways Reaching the End of the Maze");
        System.out.println(count(3, 3));
        System.out.println();

        System.out.println("Path Only down and right");
        path("", 3, 3);
        System.out.println();

        System.out.println("Path down, right and diagonaly");
        pathDiagonal("", 3, 3);
        System.out.println();

        System.out.println("Path down and right with Obstacles");
        boolean[][] mat = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        pathObstacle("", 0, 0, mat);
        System.out.println();
    }

    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            path(p + 'R', r-1, c);
        }
        if(c > 1) {
            path(p + 'D', r, c-1);
        }
    }

        static void pathDiagonal(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            path(p + 'R', r-1, c);
        }
        if(c > 1) {
            path(p + 'D', r, c-1);
        }
        if(c > 1 && r > 1) {
            path(p + 'C', r-1, c-1); //C-cross(diagonaly)
        }
    }

    static void pathObstacle(String p, int r, int c, boolean[][] mat) {

        if(mat[r][c] == false) {
            return;
        }

        if(r == mat.length - 1 && c == mat[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(r < mat.length - 1) {
            pathObstacle(p + 'D', r + 1, c, mat);
        }

        if(c < mat[0].length - 1) {
            pathObstacle(p + 'R', r, c + 1, mat);
        }
    }

}