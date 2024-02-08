import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] bomb = new int[n];
		int max = - 1;

		for(int i = 0; i < n; i++){
			bomb[i] = sc.nextInt();
		}

		if(n == k){
			for(int i = 0; i < n - 1; i++){
				for(int j = i + 1; j < n; j++){
					if(bomb[i] == bomb[j]){
						max = Math.max(max, bomb[i]);
					}
				}
			}
		}else{
			for(int i = 0; i < n - k; i++){
				for(int j = i + 1; j <= i + k; j++){
					if(bomb[i] == bomb[j]){
						max = Math.max(max, bomb[i]);
					}
				}
			}
		}
		
		System.out.println(max);
    }
}