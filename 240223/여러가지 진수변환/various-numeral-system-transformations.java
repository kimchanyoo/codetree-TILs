import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int[] digits = new int[5];
		int cnt = 0;

		while(true){
			if(n < b){
				digits[cnt++] = n;
				break;
			}
			if(b == 4){
				digits[cnt++] = n % 4;
				n /= 4;
			}else if(b == 8){
				digits[cnt++] = n % 8;
				n /= 8;
			}
		}

		for(int i = cnt - 1; i >= 0; i--){
			System.out.print(digits[i]);
		}
    }
}