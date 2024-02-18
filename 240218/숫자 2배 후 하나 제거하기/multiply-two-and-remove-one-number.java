import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numList = new int[n];
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				ArrayList<Integer> tempList = new ArrayList<>();
				for(int k : numList){
					tempList.add(k);
				}
				tempList.set(i, tempList.get(i) * 2);
				int sum = 0;
				tempList.remove(j);

				for(int k = 0; k < tempList.size() - 1; k++){
					sum += Math.abs(tempList.get(k) - tempList.get(k + 1));
				}
				min = Math.min(min, sum);
			}
		}
		System.out.println(min);
    }
}

/*
수행시간과 메모리를 줄이는 방식
public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;

    public static int n;
    public static int[] arr = new int[MAX_N];

    // 제거된 원소의 위치를 removed_idx라 가정헀을 때,
    // 인접한 원소간의 차의 합을 계산해 반환합니다.
    public static int score(int removedIdx) {
        // 합을 계산합니다
        int sum = 0;

        // 바로 직전에 적혀있던 숫자를 기록합니다.
        // -1인 경우, 아직 숫자가 기록된 적이 없다는 뜻입니다.
        int prev = -1;

        // 각 숫자들을 순회합니다.
        for(int i = 0; i < n; i++) {
            // 지워진 원소라면 패스합니다.
            if(i == removedIdx) continue;

            // 이전에 적혀있던 숫자가 있는 경우에만
            // 인접한 숫자간의 차를 sum에 더해줍니다.
            if(prev != -1)
                sum += Math.abs(arr[i] - prev);

            // 마지막으로 적혀있던 숫자 값을 갱신해줍니다.
            prev = arr[i];
        }

        // 인접한 원소간의 차의 합을 반환합니다.
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    
        int minScore = INT_MAX;

        // 2배를 할 숫자의 위치 i를 결정하고,
        // 그 다음 제거할 숫자의 위치 j를 결정하여
        // 남은 숫자들의 인접한 차의 합 중
        // 최솟값을 찾습니다.
        for(int i = 0; i < n; i++) {
            arr[i] *= 2;

            // 제거할 숫자의 위치를 결정합니다.
            for(int j = 0; j < n; j++)
                minScore = Math.min(minScore, score(j));

            // 그 다음 상태 진행을 위해, 
            // 이전에 2배를 한 값을 다시 이전 상태로 만들어줍니다.
            arr[i] /= 2;
        }
        
        System.out.println(minScore);

*/