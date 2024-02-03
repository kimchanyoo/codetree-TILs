import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			numbers[i] = sc.nextInt();
		}

		for(int i = 0; i < n - 2; i++){
			for(int j = i + 1; j < n - 1; j++){
				for(int k = j + 1; k < n; k++){
					boolean notCarry = true;
					int sum = numbers[i] + numbers[j] + numbers[k];
					String str = String.valueOf(sum);
					for(int e = 1; e < str.length(); e++){
						if(getDigit(sum, e) != getDigit(numbers[i], e)
								+ getDigit(numbers[j], e) + getDigit(numbers[k], e)){
							notCarry = false;
							break;
						}
					}
					if(notCarry){
						max = Math.max(sum, max);
					}
				}
			}
		}

		System.out.println(max);
	}
	private static int getDigit(int number, int n){
		String input = String.valueOf(number);
		int length = input.length();
		if(length < n){
			return 0;
		}
		return input.charAt(length - n) - '0';
	}
}