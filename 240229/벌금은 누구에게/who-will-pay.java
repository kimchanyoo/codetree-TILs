import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int result = 0;
		boolean isPresent = false;

		for(int i = 0; i < m; i++){
			int num = sc.nextInt() - 1;
			arr[num]++;
			if(arr[num] >= k && !isPresent){
				result = num + 1;
				isPresent = true;
			}
		}
		if(isPresent){
			System.out.println(result);
		}else{
			System.out.println(-1);
		}
    }
}