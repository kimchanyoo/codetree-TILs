import java.util.Scanner;
public class Main {
    static boolean isFloat(int sum, int length){
		return sum % length == 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numList = new int[n];
		int cnt = 0;

		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				int sum = 0;
				int length = j - i + 1;
				for(int k = i; k <= j; k++){
					sum += numList[k];
				}
				if(isFloat(sum, length)){
					for(int k = i; k <= j; k++){
						if(sum / length == numList[k]){
							cnt++;
							break;
						}
					}
				}
			}
		}

		System.out.println(cnt);
    }
}