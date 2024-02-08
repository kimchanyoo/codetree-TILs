import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[][] arr = new int[n][2];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				int sum = (int) (Math.pow(arr[i][0] - arr[j][0], 2) + Math.pow(arr[i][1] - arr[j][1], 2));
				min = Math.min(min, sum);
			}
		}

		System.out.println(min);
    }
}