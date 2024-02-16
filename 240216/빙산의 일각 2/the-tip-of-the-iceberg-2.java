import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int maxHeight = 0;
		int result = 0;

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			maxHeight = Math.max(maxHeight, arr[i]);
		}

		for(int i = 1; i < maxHeight - 1; i++){
			int count = 0;
			boolean glued = false;
			for (int k : arr) {
				if(!glued){
					if(k > i){
						glued = true;
						count++;
					}
				}else{
					glued = k > i;
				}
			}

			result = Math.max(result, count);
		}

		System.out.println(result);
    }
}