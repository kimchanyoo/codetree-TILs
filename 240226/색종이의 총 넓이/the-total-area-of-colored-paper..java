import java.util.Scanner;

public class Main {
    static final int OFFSET = 100;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] area = new int[201][201];
		int count = 0;

		for(int i = 0; i < n; i++){
			int x = sc.nextInt() + OFFSET;
			int y = sc.nextInt() + OFFSET;
			for(int j = y; j < y + 8; j++){
				for(int k = x; k < x + 8; k++){
					area[j][k] = 1;
				}
			}
		}

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[i].length; j++){
				if(area[i][j] == 1){
					count++;
				}
			}
		}

		System.out.println(count);
    }
}