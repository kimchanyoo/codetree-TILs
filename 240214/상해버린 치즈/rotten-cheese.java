import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 사람의 수
        int M = scanner.nextInt(); // 치즈의 수
        int D = scanner.nextInt(); // 치즈를 먹은 기록의 수
        int S = scanner.nextInt(); // 아픈 기록의 수

        int[][] cheeseRecords = new int[N + 1][M + 1]; // 치즈를 먹은 사람과 시간에 대한 기록
        int[] sicknessRecords = new int[N + 1]; // 아픈 사람과 시간에 대한 기록

        for (int i = 0; i < D; i++) {
            int p = scanner.nextInt(); // 사람 번호
            int m = scanner.nextInt(); // 치즈 번호
            int t = scanner.nextInt(); // 시간
            cheeseRecords[p][m] = t;
        }

        for (int i = 0; i < S; i++) {
            int p = scanner.nextInt(); // 사람 번호
            int t = scanner.nextInt(); // 시간
            sicknessRecords[p] = t;
        }

        int medicineCount = countMedicine(N, M, D, S, cheeseRecords, sicknessRecords);
        System.out.println(medicineCount);
    }

    public static int countMedicine(int N, int M, int D, int S, int[][] cheeseRecords, int[] sicknessRecords) {
        int medicineCount = 0;

        // 치즈를 먹은 사람들 중 아픈 사람이 아닌 경우 약이 필요함
        for (int person = 1; person <= N; person++) {
            if (sicknessRecords[person] == 0) {
                medicineCount++;
            }
        }

        // 상한 치즈를 먹은 사람들 중 약이 필요한 경우 약이 필요함
        for (int person = 1; person <= N; person++) {
            for (int cheese = 1; cheese <= M; cheese++) {
                if (cheeseRecords[person][cheese] > sicknessRecords[person]) {
                    medicineCount++;
                    break;
                }
            }
        }

        return medicineCount;
    }
}