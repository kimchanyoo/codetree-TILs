import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for(int i = 1; i < 101; i++){
			if(arr[arr.length - 1] <= i){
				break;
			}
			int count = 0;
			for(int j = 0; j < arr.length - 1; j++){
				for(int k = j + 1; k < arr.length; k++){
					int previous = Math.abs(arr[j] - i);
					int after = Math.abs(arr[k] - i);
					if(previous == after){
						count++;
					}
				}
			}

            /*
            이렇게도 풀 수 있음
            // 각 숫자에 대해 
            // 등차수열의 개수를 확인합니다.
            for(int x = 1; x <= MAX_A; x++) {
                // 모든 쌍을 만들어 등차수열의 개수를 확인합니다.
                int cnt = 0;

                for(int i = 0; i < n; i++)
                    for(int j = i + 1; j < n; j++)
                        if(arr[i] + arr[j] == 2 * x)
                            cnt++;
            
                ans = Math.max(ans, cnt);
            }
            */
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}