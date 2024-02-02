import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		String[][] square = new String[r][c];

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				square[i][j] = sc.next();
			}
		}

		int cnt = countPath(square, r, c);
		System.out.println(cnt);
	}

	private static int countPath(String[][] square, int r, int c) {
		String firstColor = square[0][0];
		String lastColor = square[r -1][c -1];
		int cnt = 0;

		if(firstColor.equals(lastColor)){
			return 0;
		}

		for(int i = 1; i  <= r - 3; i++){
			for(int j = 1; j <= c - 3; j++){
				if(!firstColor.equals(square[i][j])){
					for(int k = i + 1; k <= r - 2; k++){
						for(int l = j + 1; l <= c -2; l++){
							if(!square[i][j].equals(square[k][l])){
								cnt++;
							}
						}
					}
				}
			}
		}

		return cnt;
	}
}