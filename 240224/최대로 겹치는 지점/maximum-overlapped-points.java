import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x1 = new int[n];
		int[] x2 = new int[n];
		int[] line = new int[100];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			x1[i] = sc.nextInt();
			x2[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = x1[i]; j <= x2[i]; j++){
				line[j]++;
			}
		}

		for (int j : line) {
			max = Math.max(max, j);
		}

		System.out.println(max);
    }
}