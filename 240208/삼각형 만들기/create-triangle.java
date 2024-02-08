import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int x = 0;
		int y = 0;
		int[][] arr = new int[n][2];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n -2; i++){
			for(int j = i + 1; j < n -1; j++){
				for(int k = j + 1; k < n; k++){
					int sum = 0;
					if((arr[i][0] == arr[j][0] && arr[j][0] == arr[k][0]) || arr[i][1] == arr[j][1] && arr[j][1] == arr[k][1]){
						continue;
					}
					if(arr[i][0] - arr[j][0] == 0){
						y = Math.abs(arr[i][1] - arr[j][1]);
					}else if(arr[j][0] - arr[k][0] == 0){
						y = Math.abs(arr[j][1] - arr[k][1]);
					}else if(arr[i][0] - arr[k][0] == 0){
						y = Math.abs(arr[i][1] - arr[k][1]);
					}

					if(arr[i][1] - arr[j][1] == 0){
						x = Math.abs(arr[i][0] - arr[j][0]);
					}else if(arr[j][1] - arr[k][1] == 0){
						x = Math.abs(arr[j][0] - arr[k][0]);
					}else if(arr[i][1] - arr[k][1] == 0){
						x = Math.abs(arr[i][0] - arr[k][0]);
					}

					sum = x * y;
					max = Math.max(max, sum);
				}
			}
		}

		System.out.println(max);
    }
}