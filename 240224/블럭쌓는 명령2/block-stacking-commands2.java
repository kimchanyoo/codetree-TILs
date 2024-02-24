import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] input  = new int[k][2];
		int[] blocks = new int[n];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < k; i++){
			for(int j = 0; j < 2; j++){
				input[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < k; i++){
			for(int j = input[i][0]; j <= input[i][1]; j++){
				blocks[j - 1]++;
			}
		}

		for(int i = 0; i < n; i++){
			max = Math.max(max, blocks[i]);
		}

		System.out.println(max);
    }
}