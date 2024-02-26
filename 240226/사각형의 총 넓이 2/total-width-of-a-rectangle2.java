import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] input = new int[n][4];
		int[][] area = new int[201][201];
		int count = 0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 4; j++){
				int temp = sc.nextInt();
				temp += 100;
				input[i][j] = temp;
			}
			for(int j = input[i][1]; j < input[i][3]; j++){
				for(int k = input[i][0]; k < input[i][2]; k++){
					area[j][k] = 1;
				}
			}
		}

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[i].length; j++){
				if(area[i][j] == 1){
					count++;
				}
			}
		}

		System.out.println(count);
    }
}