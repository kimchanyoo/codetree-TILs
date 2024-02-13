import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[][] rank = new int[k][n];
		int[] cntDeveloper = new int[n];
		int cnt = 0;

		for(int i = 0; i < k; i++){
			for(int j = 0; j < n; j++){
				rank[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < k; j++){
				cntDeveloper[rank[j][i] - 1]++;
			}
			for(int j = 0; j < n; j++){
				if(cntDeveloper[j] == k){
					cnt += n - (i + 1);
					cntDeveloper[j] = 0;
				}
			}
		}

		System.out.println(cnt);
    }
}