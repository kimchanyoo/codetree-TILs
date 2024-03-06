import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{0, -1, 0, 1};
	static int[] dy = new int[]{1, 0, -1, 0};
	static int dirNums = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] grid = new String[n][n];
		for(int i = 0; i < n; i++){
			grid[i] = sc.next().split("");
		}
		int k = sc.nextInt();
		dirNums = (k - 1) / n;
		int location = k - (n * dirNums) - 1;
		int x = 0, y = 0;
		int count = 1;
		
		if(dirNums == 0){
			x = location;
			y = 0;
		}else if(dirNums == 1){
			x = n - 1;
			y = location;
		}else if(dirNums == 2){
			x = location;
			y = n - 1;
		}else if(dirNums == 3){
			x = 0;
			y = location;
		}

		while(isRange(x, y, n)){
			dirNumsSet(grid, x, y);
			x += dx[dirNums];
			y += dy[dirNums];
			count++;
		}

		System.out.println(count);
	}
	private static boolean isRange(int x, int y, int n){
		return 0 <= x && x < n && 0 <= y && y < n;
	}
	private static void dirNumsSet(String[][] grid, int x, int y){
		if(grid[y][x].equals("/")){
			dirNums++;
			if(dirNums > 3){
				dirNums = 0;
			}
		}else if(grid[y][x].equals("\\")){
			dirNums--;
			if(dirNums < 0){
				dirNums = 3;
			}
		}
	}
}