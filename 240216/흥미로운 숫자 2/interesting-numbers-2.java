import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;

		for(int i = x; i < y + 1; i++){
			int num = i;
			int[] digit = new int[10];
			int allDigits = 0;
			while(num > 0) {
				digit[num % 10]++;
				allDigits++;
				num /= 10;
			}
			boolean isInteresting = true;
			int max = 0;

			for(int j : digit){
				max = Math.max(max, j);
			}

			if(allDigits - max != 1){
				isInteresting = false;
			}

			if(isInteresting){
				count++;
			}
		}

		System.out.println(count);
    }
}