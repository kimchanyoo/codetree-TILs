import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{-1, 0, 1, 0};
	static int[] dy = new int[]{0, -1, 0, 1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] area = new int[n][n];
		int x = n - 1, y = n - 1;
		int dirNum = 0;
		area[y][x] = n * n;

		for(int i = n * n; i > 1; i--){
			int nx = x + dx[dirNum];
			int ny = y + dy[dirNum];
			if((!isRange(nx, ny, n)) || (area[ny][nx] != 0)){
				dirNum++;
				if(dirNum > 3){
					dirNum = 0;
				}
				x += dx[dirNum];
				y += dy[dirNum];
				area[y][x] = i - 1;
			}else{
				area[ny][nx] = i - 1;
				x = nx;
				y = ny;
			}
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(area[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static boolean isRange(int x, int y, int n){
		return 0 <= x && x < n && 0 <= y && y < n;
	}
}