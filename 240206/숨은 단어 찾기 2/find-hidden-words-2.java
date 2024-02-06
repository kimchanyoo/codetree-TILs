import java.util.Scanner;
public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
	static boolean inRange(int x, int y, int n, int m){
		return 0 <= x && x < n && 0 <= y && y < m;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] wordList = new String[n][m];
		int cnt = 0;

		for(int i = 0; i < n; i++){
			String str = sc.next();
			for(int j = 0; j < m; j++){
				wordList[i][j] = Character.toString(str.charAt(j));
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(wordList[i][j].equals("L")){
					for(int k = 0; k < 8; k++){
						int nx = i;
						int ny = j;
						int length = 0;
						while(true){
							nx += dx[k];
							ny += dy[k];
							if(!inRange(nx, ny, n, m)){
								break;
							}
							if(wordList[nx][ny].equals("E")){
								length++;
							}else{
								break;
							}
							if(length == 2){
								cnt++;
								break;
							}
						}
					}

				}
			}
		}
		System.out.println(cnt);
    }
}