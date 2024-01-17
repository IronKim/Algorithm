import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 처리

        char[][] board = new char[N][M];

        // 보드 입력 받기
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            board[i] = row.toCharArray();
        }

        int result = countRepaints(board);
        System.out.println(result);

        scanner.close();
    }

    private static int countRepaints(char[][] board) {
        int repaints = 64;

        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[0].length - 8; j++) {
                int repaintW = 0;
                int repaintB = 0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if ((x + y) % 2 == 0) {  // 짝수 칸은 흰색
                            if (board[i + x][j + y] == 'B') {
                                repaintW++;
                            } else {
                                repaintB++;
                            }
                        } else {  // 홀수 칸은 검은색
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