import java.util.Scanner;

public class Main {
    public static int[] developerList = new int[5];
	public static int total = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int minDiff = Integer.MAX_VALUE;

		for(int i = 0; i < 5; i++){
			developerList[i] = sc.nextInt();
			total += developerList[i];
		}

		for(int i = 0; i < 5; i++){
			for(int j = i + 1; j < 5; j++){
				for(int k = 0; k < 5; k++){
					for(int l = k + 1; l < 5; l++){
						if(k == i || k == j || l == i || l == j){
							continue;
						}
						minDiff = Math.min(minDiff, diff(i, j, k, l));
					}
				}
			}
		}

		if(minDiff == Integer.MAX_VALUE){
			minDiff = -1;
		}

		System.out.println(minDiff);
	}
	private static int diff(int i, int j, int k, int l){
		int sum1 = developerList[i] + developerList[j];
		int sum2 = developerList[k] + developerList[l];
		int sum3 = total - (sum1 + sum2);

		if(sum1 == sum2 && sum2 == sum3){
			return Integer.MAX_VALUE;
		}

		int max = Math.max(Math.max(sum1, sum2), sum3);
		int min = Math.min(Math.min(sum1, sum2), sum3);

		return max - min;
	}
}