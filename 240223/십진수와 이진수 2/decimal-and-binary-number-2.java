import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] binary = sc.next().split("");
		int[] decimal = new int[40];
		int cnt = 0;
		int num = 0;

		for(int i = 0; i < binary.length; i++){
			int power = (int)(Math.pow(2, binary.length - i - 1));
			num += power * Integer.parseInt(binary[i]);
		}

		num *= 17;

		while(true){
			if(num < 2){
				decimal[cnt++] = num;
				break;
			}

			decimal[cnt++] = num % 2;
			num /= 2;
		}

		for(int i = cnt - 1; i >= 0; i--){
			System.out.print(decimal[i]);
		}
    }
}