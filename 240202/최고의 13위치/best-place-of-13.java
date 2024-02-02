import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] square = new int[n][n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				square[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - 2; j++){
				int sum = square[i][j] + square[i][j + 1] + square[i][j + 2];
				max = Math.max(max, sum);
			}
		}

		System.out.println(max);
    }
}