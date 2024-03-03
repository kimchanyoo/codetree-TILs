import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{1, 0, -1, 0};
	static int[] dy = new int[]{0, -1, 0, 1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strList = str.split("");
		int dirNum = 3;
		int nx = 0, ny = 0;

		for (String s : strList) {
			switch (s) {
				case "L" -> {
					if (dirNum == 0) {
						dirNum = 3;
					} else {
						dirNum--;
					}
				}
				case "R" -> dirNum = (dirNum + 1) % 4;
				case "F" -> {
					nx += dx[dirNum];
					ny += dy[dirNum];
				}
			}
		}

		System.out.println(nx + " " + ny);
	}
}