import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		int[][] eatCheese = new int[n][m];
		int[] spoiled = new int[n];
		int[] eatNumber = new int[m];
		int result = Integer.MIN_VALUE;
		int count = 1;

		for(int i = 0; i < d; i++){
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if(eatCheese[x][y] == 0){
				eatCheese[x][y] =  sc.nextInt();
				eatNumber[y]++;
			}else{
				eatCheese[x][y] = Math.min(eatCheese[x][y], sc.nextInt());
			}
		}

		for(int i = 0; i < s; i++){
			spoiled[sc.nextInt() - 1] = sc.nextInt();
		}

		if(s == 0){
			result = Arrays.stream(eatNumber).max().getAsInt();
		}else{
			for(int i = 0; i < spoiled.length; i++){
				if(spoiled[i] == 0){
					continue;
				}else{
					for(int j = 0; j < m; j++){
						if(eatCheese[i][j] == 0){
							continue;
						}else{
							if(eatCheese[i][j] < spoiled[i]){
								count = 1;
								for(int k = 0; k < n; k++){
									if(k == i){
										continue;
									}else{
										if(eatCheese[k][j] != 0){
											count++;
										}
									}

								}

								result = Math.max(result, count);
							}
						}
					}
				}
			}
		}

		System.out.println(result);
    }
}