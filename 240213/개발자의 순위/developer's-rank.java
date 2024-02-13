import java.util.Scanner;

public class Main {
    static int k, n;                       // k: 경기의 수, n: 개발자 수
    static int[][] play;                    // 경기 결과 순위
    static int[][] winCnt;                  // winCnt[i][j]: i번 개발자가 j번 개발자보다 높은 순위
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();      // k번 경기에 대해 n명의 개발자 순위가 주어짐
        n = sc.nextInt();

        play = new int[k][n];
        winCnt = new int[n + 1][n + 1];

        for (int i = 0; i < k; i++) {
            // 입력
            for (int j = 0; j < n; j++)
                play[i][j] = sc.nextInt();

            // 이긴 횟수 저장
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    winCnt[play[i][j]][play[i][k]]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (winCnt[i][j] == k) ans++;  // 항상(k번의 경기수에 대해) i가 j보다 높은 순위라면
            }
        }

        System.out.println(ans);
        sc.close();
    }
}