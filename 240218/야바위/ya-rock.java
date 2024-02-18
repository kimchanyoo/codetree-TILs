import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] pebble = new int[n][3];
		int max = -1;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 3; j++){
				pebble[i][j] = sc.nextInt() - 1;
			}
		}

		for(int i = 0; i < 3; i++){
			int count = 0;
			boolean[] cups = new boolean[3];
			cups[i] = true;
			for(int j = 0; j < n; j++){
				boolean temp = cups[pebble[j][0]];
				cups[pebble[j][0]] = cups[pebble[j][1]];
				cups[pebble[j][1]] = temp;

				if(cups[pebble[j][2]]){
					count++;
				}
			}
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}