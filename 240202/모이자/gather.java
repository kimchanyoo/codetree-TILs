import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numList = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < n; j++){
				if(i!=j){
					sum += numList[j] * Math.abs(i - j);
				}
			}
			min = Math.min(min, sum);
		}

		System.out.println(min);
    }
}