import java.util.*;

class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        char status = ' ';
        Scanner scan = new Scanner(System.in);
        printBoard(board);

        while(!gameOver) {
            System.out.print("Player " + player + " enter: ");
            int row = scan.nextInt();
            int col = scan.nextInt();
            System.out.println();

            if(board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver) {
                    status = player;
                    System.out.println("Player " + player + " Has Won!");
                } else if(isBoardFull(board)) {
                    gameOver = true;
                    status = 'D';
                    System.out.println("The match is Draw!");
                }
                else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Wrong Move, Try again!");
            }
            printBoard(board); 
            System.out.println();
        }
    }

    static boolean haveWon(char[][] board, char player) {
        for(int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        for(int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    static boolean isBoardFull(char[][] board){
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
