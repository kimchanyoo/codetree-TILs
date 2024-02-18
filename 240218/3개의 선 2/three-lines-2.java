import java.util.Scanner;

public class Main {
    static int MAX_X = 10;
	static int MAX_N = 20;
	static int[][] points = new int[MAX_N][2];
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			points[i][0] = scanner.nextInt();
			points[i][1] = scanner.nextInt();
		}


// 모든 직선에 대해 전부 시도해 봅니다.
		for (int i = 0; i <= MAX_X; i++) {
			for (int j = 0; j <= MAX_X; j++) {
				for (int k = 0; k <= MAX_X; k++) {
// 가능한 모든 조합을 확인해봅니다.
					String[] combs = {"xxx", "xxy", "xyx", "yxx", "yyy"};
					for (String comb : combs) {
						if (isPossible(comb, new int[]{i, j, k})) {
							System.out.println(1);
							System.exit(0);
						}
					}
				}
			}
		}

		System.out.println(0);
	}
	private static boolean isPossible(String comb, int[] vals) {
		for (int[] point : points) {
			boolean passed = false;
			for (int i = 0; i < comb.length(); i++) {
				char ch = comb.charAt(i);
				int val = vals[i];
				int x = point[0];
				int y = point[1];
				if ((ch == 'x' && x == val) || (ch == 'y' && y == val)) {
					passed = true;
				}
			}
			if (!passed) {
				return false;
			}
		}
		return true;
	}
}