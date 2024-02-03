import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			numbers[i] = sc.nextInt();
		}

		for(int i = 0; i < n - 2; i++){
			for(int j = i + 2; j < n; j++){
				int sum = numbers[i] + numbers[j];
				max = Math.max(max, sum);
			}
		}

		System.out.println(max);
    }
}