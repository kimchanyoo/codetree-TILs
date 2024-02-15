import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] line;
		int b = 0;
		int cnt = 0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				arr[i][j] = sc.nextInt();
				if(j == 1){
					b = Math.max(b, arr[i][j]);
				}
			}
		}

		for(int i = 0; i < n -2; i++){
			for(int j = i + 1; j < n - 1; j++){
				for(int k = j + 1; k < n; k++){
					line = new int[b + 1];
					boolean isOverlap = false;
					for(int l = 0; l < n; l++) {
						if (l == i || l == j || l == k) {
							continue;
						}
						for (int e = arr[l][0]; e <= arr[l][1]; e++) {
							line[e]++;
						}
					}
					for (int value : line) {
						if (value > 1) {
							isOverlap = true;
							break;
						}
					}
					if(!isOverlap){
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
    }
}