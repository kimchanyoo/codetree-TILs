import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{0, -1, 0, 1};
	static int[] dy = new int[]{1, 0, -1, 0};
	static int dirNums = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] grid = new char[n][n];
		for(int i = 0; i < n; i++){
			grid[i] = sc.next().toCharArray();
		}
		int k = sc.nextInt();
		dirNums = (k - 1) / n;
		int x = 0, y = 0;
		int count = 0;

		if(dirNums == 0){
			x = k - 1;
			y = 0;
		}else if(dirNums == 1){
			x = n - 1;
			y = k - n - 1;
		}else if(dirNums == 2){
			x = 3 * n - k;
			y = n - 1;
		}else if(dirNums == 3){
			x = 0;
			y = 4 * n - k;
		}

		while(isRange(x, y, n)){
			count++;
			dirNumsSet(grid, x, y);
			x += dx[dirNums];
			y += dy[dirNums];
		}

		System.out.println(count);
	}
	private static boolean isRange(int x, int y, int n){
		return 0 <= x && x < n && 0 <= y && y < n;
	}
	private static void dirNumsSet(char[][] grid, int x, int y){
		if(grid[y][x] == '/'){
			if(dirNums == 0 || dirNums == 1){
				dirNums = 1 - dirNums;
			}else if(dirNums == 2 || dirNums == 3){
				dirNums = 5 - dirNums;
			}
		}else if(grid[y][x] == '\\'){
			dirNums = 3 - dirNums;
		}
	}
}