import java.util.Scanner;

public class Main {
    static final int OFFSET = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] area = new int[201][201];
		int count = 0;

		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt() + OFFSET;
			int y1 = sc.nextInt() + OFFSET;
			int x2 = sc.nextInt() + OFFSET;
			int y2 = sc.nextInt() + OFFSET;
			if (i % 2 == 1) {
				for (int j = y1; j < y2; j++) {
					for (int k = x1; k < x2; k++) {
						area[j][k] = 2;
					}
				}
			} else {
				for (int j = y1; j < y2; j++) {
					for (int k = x1; k < x2; k++) {
						area[j][k] = 1;
					}
				}
			}

		}

		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				if (area[i][j] == 2) {
					count++;
				}
			}
		}

		System.out.println(count);
    }
}