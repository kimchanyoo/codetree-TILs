import java.util.Scanner;
public class Main {
    static int[] dx = {-1, 0, 0, 1}, dy = {0, -1, 1, 0};
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int[][] area = new int[19][19];
		for(int i = 0; i < 19; i++){
			for(int j = 0; j < 19; j++){
				area[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++) {
				if(area[i][j] == 0) continue;

				for(int k = 0; k < 4; k++) { // 모든 방향 탐색
					int curt = 1;
					int curx = i;
					int cury = j; // 현재 위치랑 탐색할 위치 분리
					while(true) {
						int nx = curx + dx[k];
						int ny = cury + dy[k]; // 탐색할 위치 계산
						if(!inRange(nx, ny))
							break;
						if(area[nx][ny] != area[i][j])
							break;
						// 계산된 탐색할 위치 검증
						curt++;
						curx = nx;
						cury = ny;
						// 해당 위치로 이동
					}
					if(curt == 5) {
						System.out.println(area[i][j]);
						System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
						System.exit(0);
					}
				}
			}
		}
        System.out.println(0);
	}
	private static boolean inRange(int x, int y){
		if(x >= 19 || y >= 19){
			return false;
		}else return x >= 0 && y >= 0;
	}
}