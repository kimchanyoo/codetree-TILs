import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			int count = 0;
			int temp = i;
			for(int j = 0; j < m; j++){
				count += arr[temp];
				temp = arr[temp] -1 ;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
    }
}