import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] bomb = new int[n];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			bomb[i] = sc.nextInt();
		}

		for(int i = 0; i < n - k; i++){
			for(int j = i + 1; j <= i + k; j++){
				if(bomb[i] == bomb[j]){
					max = Math.max(max, bomb[i]);
				}
			}
		}

		System.out.println(max);
    }
}