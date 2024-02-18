import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int previous = c / a;
		int after = c / b;

		int max = -1;

		for(int i = 0; i <= previous; i++){
			for(int j = 0; j <= after; j++){
				int sum = a * i + b * j;
				if(sum <= c){
					max = Math.max(max, sum);
				}else{
					break;
				}
			}
		}
		System.out.println(max);
    }
}