import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = n;
		int[][] arr = new int[n][2];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));
		
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[j][0] >= arr[i][0] && arr[j][0] <= arr[i][1]){
					if(arr[j][1] >= arr[i][0] && arr[j][1] <= arr[i][1]){
						cnt = cnt - 2;
						break;
					}
				}
			}
		}

		System.out.println(cnt);
    }
}