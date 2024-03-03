import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 격자의 크기를 의미하는 변수
        int[][] arr = new int[n][n]; // 격자를 저장하는 2차원 배열

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[] dxs = {0, 1, 0, -1};
        int[] dys = {1, 0, -1, 0};

        int ans = 0; // 주변에 1이 3개 이상 있는 격자의 개수

        // 모든 칸 탐색하기!
        for (int i = 0; i < n; i++) { // 이번에 탐색할 행의 번호
            for (int j = 0; j < n; j++) { // i번 행에서 이번에 탐색할 열 번호
                int cnt = 0; // i행 j열 주변에 있는 1의 개수

                for (int dir_num = 0; dir_num < 4; dir_num++) { // 인접한 방향을 결정
                    // ni, nj 가 dir_num 방향으로 인접한 격자의 행, 열 번호
                    int ni = i + dxs[dir_num];
                    int nj = j + dys[dir_num];

                    // (nx, ny)가 유효하고, 1이 써 있는 격자라면
                    if (inRange(n, ni, nj) && arr[ni][nj] == 1) {
                        cnt++; // 1의 개수를 하나 늘려준다.
                    }
                }

                if (cnt >= 3) { // 주변에 1이 3개 이상 있다면
                    ans++; // 정답을 1 증가시킨다.
                }
            }
        }

        System.out.println(ans);
    }

    public static boolean inRange(int n, int x, int y) { // x행 y열이 격자에 존재하는 지 확인하는 함수
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}