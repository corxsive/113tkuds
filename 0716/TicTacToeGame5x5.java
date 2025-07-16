import java.util.*;

class TicTacToeGame5x5 {
    private static final char EMPTY = '.';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static final int SIZE = 5;
    
    /**
     * 初始化 5x5 的井字遊戲棋盤
     */
    static char[][] initializeBoard() {
        char[][] board = new char[SIZE][SIZE];
        
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
        
        return board;
    }
    
    /**
     * 列印棋盤，包含行列座標
     */
    static void printBoard(char[][] board) {
        System.out.println("\n  井字遊戲棋盤");
        System.out.println("  0 1 2 3 4");
        
        for (int row = 0; row < SIZE; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col]);
                if (col < SIZE-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    /**
     * 放置棋子
     */
    static boolean placePiece(char[][] board, int row, int col, char player) {
        // 檢查座標是否有效
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            System.out.printf("無效座標：(%d, %d)\n", row, col);
            return false;
        }
        
        // 檢查該位置是否已被佔用
        if (board[row][col] != EMPTY) {
            System.out.printf("位置 (%d, %d) 已被佔用\n", row, col);
            return false;
        }
        
        board[row][col] = player;
        System.out.printf("玩家 %c 在位置 (%d, %d) 放置棋子\n", player, row, col);
        return true;
    }
    
    /**
     * 檢查是否有玩家獲勝
     */
    static char checkWinner(char[][] board) {
        // 檢查行
        for (int row = 0; row < SIZE; row++) {
            int count = 0;
            char last = EMPTY;
            for(char curr : board[row]) {
                if(curr == EMPTY) {
                    count = 0;
                    last = EMPTY;
                } else if(curr == last) {
                    count += 1;
                } else {
                    count = 1;
                    last = curr;
                }

                if(count == 3) return last;
            }
        }
        
        // 檢查列
        for (int col = 0; col < SIZE; col++) {
            int count = 0;
            char last = EMPTY;
            for(int i=0; i<SIZE; ++i) {
                char curr = board[i][col];
                if(curr == EMPTY) {
                    count = 0;
                    last = EMPTY;
                } else if(curr == last) {
                    count += 1;
                } else {
                    count = 1;
                    last = curr;
                }

                if(count == 3) return last;
            }
        }
        
        // // 檢查主對角線
        // if (board[0][0] != EMPTY && 
        //     board[0][0] == board[1][1] && 
        //     board[1][1] == board[2][2]) {
        //     return board[0][0];
        // }
        
        // // 檢查反對角線
        // if (board[0][2] != EMPTY && 
        //     board[0][2] == board[1][1] && 
        //     board[1][1] == board[2][0]) {
        //     return board[0][2];
        // }

        //diag
        //topleft to bottomright
        for(int i=0; i<SIZE-2; ++i) {
            for(int j=0; j<SIZE-2; ++j) {
                if (board[i][j] != EMPTY && 
                    board[i][j] == board[i+1][j+2] && 
                    board[i][j] == board[i+2][j+2]) {
                    return board[i][j];
                }
            }
        }

        //topright to bottomleft
        for(int i=0; i<SIZE-2; ++i) {
            for(int j=SIZE - 1; j>2; --j) {
                if (board[i][j] != EMPTY && 
                    board[i][j] == board[i+1][j-1] && 
                    board[i][j] == board[i+2][j-2]) {
                    return board[i][j];
                }
            }
        }
        
        return EMPTY;  // 沒有獲勝者
    }
    
    /**
     * 檢查棋盤是否已滿
     */
    static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        char[][] board = initializeBoard();
        
        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard(board);
        
        char currentPlayer = PLAYER_X;
        
        Scanner sc = new Scanner(System.in);

        while(true) {
            String line = sc.nextLine().trim();
            int row = Integer.parseInt(line.split(" ")[0]);
            int col = Integer.parseInt(line.split(" ")[1]);
            
            if (placePiece(board, row, col, currentPlayer)) {
                printBoard(board);
                
                char winner = checkWinner(board);
                if (winner != EMPTY) {
                    System.out.printf("\n🎉 玩家 %c 獲勝！\n", winner);
                    break;
                } else if (isBoardFull(board)) {
                    System.out.println("\n🤝 平手！");
                    break;
                }
                
                // 切換玩家
                currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
            }
        }
    }
}
