import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static int n;
    public static char[] seats;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        seats = sc.next().toCharArray();

        // Step1. 최적의 위치 찾기
        // 인접한 쌍들 중 가장 먼 1간의 쌍을 찾습니다.
        int maxDist = 0;
        int maxI = 0, maxJ = 0;
        for(int i = 0; i < n; i++) {
            if(seats[i] == '1') {
                for(int j = i + 1; j < n; j++)
                    if(seats[j] == '1') {
                        // 1간의 쌍을 골랐을 때
                        // 두 좌석간의 거리가 지금까지의 최적의 답 보다 더 좋다면
                        // 값을 갱신해줍니다.
                        if(j - i > maxDist) {
                            maxDist = j - i;

                            // 이때, 두 좌석의 위치를 기억합니다.
                            maxI = i;
                            maxJ = j;
                        }

                        // 인접한 쌍을 찾았으므로 빠져나옵니다.
                        break;
                    }
            }
        }

        // Step2. 최적의 위치에 1을 놓습니다.
        // 가장 먼 쌍의 위치 가운데에 놓으면 됩니다.
        seats[(maxI + maxJ) / 2] = '1';

        // Step3. 이제 인접한 쌍들 중 가장 가까운 1간의 쌍을 찾습니다.
        // 이때의 값이 답이 됩니다.
        int ans = INT_MAX;
        for(int i = 0; i < n; i++) {
            if(seats[i] == '1') {
                for(int j = i + 1; j < n; j++)
                    if(seats[j] == '1') {
                        ans = Math.min(ans, j - i);
                        
                        // 인접한 쌍을 찾았으므로 빠져나옵니다.
                        break;
                    }
            }
        }

        System.out.print(ans);
    }
}