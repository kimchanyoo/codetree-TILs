import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
	static final int MAX_T = 1000000;
	static int[] a = new int[MAX_T + 1];
	static int[] b = new int[MAX_T + 1];
	public static void main(String[] args){
		int n = sc.nextInt();
		int m = sc.nextInt();
		caculation(n, a);
		caculation(m, b);
		int first = 0;
		int count = 0;

		for(int i = 1; i < MAX_T + 1; i++){
			if(i == 1){
				if(a[i] > b[i]){
					first = 1;
				}else if(a[i] < b[i]){
					first = 2;
				}else{
					first = 10;
				}
			}else{
				if(a[i] > b[i] && first != 1){
					first = 1;
					count++;
				}else if(a[i] < b[i] && first != 2){
					first = 2;
					count++;
				}else if(a[i] == b[i] && first != 10){
					first = 10;
					count++;
				}
			}
		}

		System.out.println(count);
	}

	private static void caculation(int num, int[] arr) {
		int location = 1;
		int temp = 0;

		for(int i = 0; i < num; i++){
			int v = sc.nextInt();
			int t = sc.nextInt();
			for(int j = 0; j < t; j++){
				arr[location] = temp + v;
				temp = arr[location];
				location++;
			}
		}
	}
}