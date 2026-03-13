import java.util.Arrays;

class BackTrackingInMaze {

    public static void main(String[] args) {

        boolean[][] mat = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[mat.length][mat[0].length];

        System.out.println("Path All Directions");
        allPath("", 0, 0, mat);
        System.out.println();
        

        System.out.println("Print values of all paths");
        printValueOfAllPath("", 0, 0, mat, path, 1);
        System.out.println();
    }

    static void allPath(String p, int r, int c, boolean[][] mat) {

        if(r == mat.length - 1 && c == mat[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(mat[r][c] == false) {
            return;
        }

        //mark the cell as false if visited
        mat[r][c] = false;

        //Down
        if(r < mat.length - 1) {
            allPath(p + 'D', r + 1, c, mat);
        }

        //right
        if(c < mat[0].length - 1) {
            allPath(p + 'R', r, c + 1, mat);
        }

        //up
        if(r > 0) {
            allPath(p + 'U', r-1, c, mat);
        }

        //left
        if(c > 0) {
            allPath(p + 'L', r, c-1, mat);
        }

        //this line is where the function will be over
        //so before the function gets over, revert the changes made by the function
        //(eg: if the function had set false to the path then revert it to true)
        mat[r][c] = true;
    }


    //print the path value of the matrix 
    static void printValueOfAllPath(String p, int r, int c, boolean[][] mat, int[][] path, int step) {

        if(r == mat.length - 1 && c == mat[0].length - 1) {
            path[r][c] = step; //the last step is also a part of the path so we need to set it in the path matrix
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(mat[r][c] == false) {
            return;
        }

        //mark the cell as false if visited
        mat[r][c] = false;
        path[r][c] = step;

        //Down
        if(r < mat.length - 1) {
            printValueOfAllPath(p + 'D', r + 1, c, mat, path, step+1);
        }

        //right
        if(c < mat[0].length - 1) {
            printValueOfAllPath(p + 'R', r, c + 1, mat, path, step+1);
        }

        //up
        if(r > 0) {
            printValueOfAllPath(p + 'U', r-1, c, mat, path, step+1);
        }

        //left
        if(c > 0) {
            printValueOfAllPath(p + 'L', r, c-1, mat, path, step+1);
        }

        //this line is where the function will be over
        //so before the function gets over, revert the changes made by the function
        //(eg: if the function had set false to the path then revert it to true)
        mat[r][c] = true;
        path[r][c] = 0;
    }
}