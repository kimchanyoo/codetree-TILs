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

		for(int i = 0; i < spoiled.length; i++){
			if(spoiled[i] != 0){
				for(int j = 0; j < m; j++){
					if(eatCheese[i][j] != 0){
						if(eatCheese[i][j] < spoiled[i]){
							count = 1;
							boolean isPresent = true;
							for(int l = 0; l < s; l++){
								if(spoiledPerson[l] == i + 1){
									continue;
								}
								if(eatCheese[spoiledPerson[l]][j] == 0){
									isPresent = false;
									break;
								}
							}
							if(!isPresent){
								break;
							}

							for(int k = 0; k < n; k++){
								if(k == i){
									continue;
								}
								if(eatCheese[k][j] != 0) {
									count++;
								}
							}

							result = Math.max(result, count);
						}
					}
				}
			}
		}

		System.out.println(result);
    }
}