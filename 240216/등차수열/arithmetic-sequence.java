import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for(int i = 1; i < 101; i++){
			if(arr[arr.length - 1] <= i){
				break;
			}
			int count = 0;
			for(int j = 0; j < arr.length - 1; j++){
				for(int k = j + 1; k < arr.length; k++){
					int previous = Math.abs(arr[j] - i);
					int after = Math.abs(arr[k] - i);
					if(previous == after){
						count++;
					}
				}
			}
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}