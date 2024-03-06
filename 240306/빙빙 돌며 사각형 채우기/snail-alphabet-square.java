import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{1, 0, -1, 0};
	static int[] dy = new int[]{0, 1, 0, -1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] area = new char[n][m];
		int x = 0, y = 0;
		int dirNum = 0;
		area[y][x] = 'A';
		int num = 66;

		for(int i = 1; i < n * m; i++){
			int nx = x + dx[dirNum];
			int ny = y + dy[dirNum];
			if(num > 90){
				num = 65;
			}
			if((!isRange(nx, ny, n, m)) || (area[ny][nx] != 0)){
				dirNum++;
				if(dirNum > 3){
					dirNum = 0;
				}
				x += dx[dirNum];
				y += dy[dirNum];
				area[y][x] = (char) num;
			}else{
				area[ny][nx] = (char) num;
				x = nx;
				y = ny;
			}
			num++;
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(area[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static boolean isRange(int x, int y, int n, int m){
		return 0 <= x && x < m && 0 <= y && y < n;
	}
}