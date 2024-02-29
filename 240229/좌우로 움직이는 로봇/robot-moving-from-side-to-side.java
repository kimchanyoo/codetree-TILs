import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
	static final int OFFSET = 1000000;
	static int move = 0;
	public static void main(String[] args){
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[OFFSET + 1];
		int[] b = new int[OFFSET + 1];
		int count = 0;

		caculation(n, a);
		caculation(m, b);

		for(int i = 1; i <= move; i++){
			if(a[i] == b[i]){
				if(a[i - 1] != b[i - 1]){
					count++;
				}
			}
		}

		System.out.println(count);
	}

	private static void caculation(int num, int[] arr) {
		int location = 0;

		for(int i = 0; i < num; i++){
			int t = sc.nextInt();
			char direction = sc.next().charAt(0);
			if(direction == 'L'){
				for(int j = 0; j < t; j++){
					arr[location + 1] = arr[location] - 1;
					location++;
				}
			}else{
				for(int j = 0; j < t; j++){
					arr[location + 1] = arr[location] + 1;
					location++;
				}
			}
		}

		for(int i = location; i < OFFSET; i++){
			arr[i + 1] = arr[i];
		}

		if(location >= move){
			move = location;
		}
	}
}