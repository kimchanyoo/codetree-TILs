import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{0, 1, -1, 0};
	static int[] dy = new int[]{1, 0, 0, -1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		String d = sc.next();
		int dirNum = 0;

		switch (d) {
			case "U":
				dirNum = 3;
				break;
			case "D":
				dirNum = 0;
				break;
			case "R":
				dirNum = 1;
				break;
			case "L":
				dirNum = 2;
				break;
		}

		for(int i = 0; i < t; i++){
			int nx = r + dy[dirNum];
			int ny = c + dx[dirNum];
			if(!isRange(nx, ny, n)){
				dirNum = 3 - dirNum;
			}else{
				r = nx;
				c = ny;
			}
		}

		System.out.println(r + " " + c);
	}
	private static boolean isRange(int r, int c, int n){
		return 1 <= r && r <= n && 1 <= c && c <= n;
	}
}