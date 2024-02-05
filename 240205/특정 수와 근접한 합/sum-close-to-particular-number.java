import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				int temp = Math.abs(s - (sum - arr[i] - arr[j]));
				min = Math.min(min, temp);
			}
		}

		System.out.println(min);
    }
}