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
		int[] spoiledPerson = new int[s];
		int result = Integer.MIN_VALUE;
		int count = 0;

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
			int x = sc.nextInt() - 1;
			spoiled[x] = sc.nextInt();
			spoiledPerson[i] = x;
		}

		if(s == 0){
			result = Arrays.stream(eatNumber).max().getAsInt();
		}else{
			for(int i = 0; i < spoiled.length; i++){
				if(spoiled[i] != 0){
					for(int j = 0; j < m; j++){
						if(eatCheese[i][j] != 0){
							if(eatCheese[i][j] < spoiled[i]){
								count = 1;
								for(int k = 0; k < n; k++){
									boolean isPresent = true;
									if(k == i){
										continue;
									}
									for(int l = 0; l < s; l++){
										if(eatCheese[spoiledPerson[l]][j] == 0){
											isPresent = false;
											break;
										}
									}
									if(!isPresent){
										break;
									}else{
										if(eatCheese[k][j] != 0) {
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