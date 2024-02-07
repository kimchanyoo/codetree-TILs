import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int h = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[] field = new int[n];

		for(int i = 0; i < n; i++){
			field[i] = sc.nextInt();
		}
        if(n == t){
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum += Math.abs(field[i] - h);
			}
			min = sum;
		}else{
			for(int i = 0; i <= n - t; i++){
				int sum = 0;
				for(int j = i; j < i + t; j++){
					sum += Math.abs(field[j] - h);
				}
				min = Math.min(min, sum);
			}
		}

		System.out.println(min);
    }
}