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
			if(numList[i] > t){
				count++;
			}else{
				count = 0;
			}
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}