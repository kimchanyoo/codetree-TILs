import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] candyCount = new int[101];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			candyCount[sc.nextInt()] += num;
		}
		if(2 * k > 100){
			for(int i = 0; i <= 100; i++){
				int sum = 0;
				for(int j = i; j <= 100; j++){
					sum += candyCount[j];
				}
				max = Math.max(max, sum);
			}
		}else{
			for(int i = 0; i <= 100 - 2 * k; i++){
				int sum = 0;
				for(int j = i; j <= i + 2 * k; j++){
					sum += candyCount[j];
				}
				max = Math.max(max, sum);
			}
		}

		System.out.println(max);
    }
}