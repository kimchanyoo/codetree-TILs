import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] line = new int[101];
		int[][] arr = new int[n][2];
		boolean isPresent = false;
		int max = -1;

		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i][0] = a;
			arr[i][1] = b;
			max = Math.max(b, max);
			for(int j = a; j <= b; j++){
				line[j]++;
			}
		}
		
		for(int i = 0; i< n; i++){
			for(int j = arr[i][0]; j <= arr[i][1]; j++){
				line[j]--;
			}
			for(int j = 0; j <= max; j++){
				if(line[j] == n - 1){
					isPresent = true;
					break;
				}
			}
			if(isPresent){
				break;
			}else{
				for(int j = arr[i][0]; j <= arr[i][1]; j++){
					line[j]++;
				}
			}
		}

		if(isPresent){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }
}