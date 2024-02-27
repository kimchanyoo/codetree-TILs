import java.util.Scanner;

public class Main {
    static final int OFFSET = 100000;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] area = new int[2 * OFFSET + 1];
		int start = 100000;
		int white = 0;
		int black = 0;

		for(int i = 0; i < n; i++){
			int distance = sc.nextInt();
			char direction = sc.next().charAt(0);

			if(direction == 'R'){
				for(int j = start; j < start + distance; j++){
					area[j] = 100;
				}
				start += (distance - 1);
			}else{
				for(int j = start; j > start - distance; j--){
					area[j] = 1;
				}
				start -= (distance - 1);
			}
		}

		for(int j : area) {
			if(j == 1) {
				white++;
			}else if(j == 100){
				black++;
			}
		}

		System.out.println(white + " " + black);
    }
}