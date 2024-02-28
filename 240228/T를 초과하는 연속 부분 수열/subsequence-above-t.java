import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] numList = new int[n];
		int max = -1;
		int count = 0;

		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			if(i >= 1 && numList[i] > t && numList[i] > numList[i - 1]){
				count++;
			}else{
				count = 1;
			}
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}