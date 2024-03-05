import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{0, 1, 0, -1};
	static int[] dy = new int[]{-1, 0, 1, 0};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] grid = new int[n][n];

		for(int i = 0; i < m; i++){
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int count = 0;
			grid[y][x] = 1;

			for(int j = 0; j <= 3; j++){
				int nx = x + dx[j];
				int ny = y + dy[j];
				if(isRange(nx, ny, n) && grid[ny][nx] == 1){
					count++;
				}
			}
			System.out.println(i + "번쨰의 count 갯수 : " + count);
			if(count == 3){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}

	private static boolean isRange(int x, int y, int n){
		return 0 <= x && x < n && 0 <= y && y < n;
	}
}