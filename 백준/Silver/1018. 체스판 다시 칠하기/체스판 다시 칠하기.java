import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = br.readLine().split(" ");
        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]);

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            board[i] = row.toCharArray();
        }

        int result = countRepaints(board);
        bw.write(result + "\n");

        br.close();
        bw.close();
    }

    private static int countRepaints(char[][] board) {
        int repaints = 64;

        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[0].length - 8; j++) {
                int repaintW = 0;
                int repaintB = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if ((x + y) % 2 == 0) { 
                            if (board[i + x][j + y] == 'B') {
                                repaintW++;
                            } else {
                                repaintB++;
                            }
                        } else {  
                            if (board[i + x][j + y] == 'W') {
                                repaintW++;
                            } else {
                                repaintB++;
                            }
                        }
                    }
                }

                repaints = Math.min(repaints, repaintW);
                repaints = Math.min(repaints, repaintB);
            }
        }

        return repaints;
    }
}
