import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				time[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++){
			int sum = 0;
			int[] workTable = new int[1000];
			for(int j = 0; j < n; j++){
				if(i == j) continue;
				for(int k = time[j][0]; k < time[j][1]; k++){
					workTable[k] = 1;
				}
			}
			for (int k : workTable) {
				sum += k;
			}
			max = Math.max(max, sum);
		}

		System.out.println(max);
    }
}