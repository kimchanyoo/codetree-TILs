import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numList = new int[n];
		int count = 0;

		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			if(i == 0 || numList[i] != numList[i - 1]){
				count++;
			}
		}

		System.out.println(count);
    }
}