import java.util.Scanner;
public class Main {
    public static final int DIR_NUM = 8;

	public static int[][] arr = new int[19][19];

	public static int[] dx = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
	public static int[] dy = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};

	public static boolean inRange(int x, int y) {
		return 0 <= x && x < 19 && 0 <= y && y < 19;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력
		for(int i = 0; i < 19; i++)
			for(int j = 0; j < 19; j++)
				arr[i][j] = sc.nextInt();

		// 모든 좌표에서 다 확인해봅니다.
		for(int i = 0; i < 19; i++) {
			// 격자를 벗어나지 않을 범위로만 잡습니다.
			for(int j = 0; j < 19; j++) {
				if(arr[i][j] == 0) continue;

				for(int k = 0; k < DIR_NUM; k++) {
					int curt = 1;
					int curx = i;
					int cury = j;
					while(true) {
						int nx = curx + dx[k];
						int ny = cury + dy[k];
						if(inRange(nx, ny) == false)
							break;
						if(arr[nx][ny] != arr[i][j])
							break;
						curt++;
						curx = nx;
						cury = ny;
					}
					if(curt == 5) {
						System.out.println(arr[i][j]);
						System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
						System.exit(0);
					}
				}
			}
		}
		System.out.print(0);
	}
}