import java.util.Scanner;

public class Main {
    static final int OFFSET = 1000;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] area = new int[2001][2001];
		int minX = Integer.MAX_VALUE;
		int maxX = -1;
		int minY = Integer.MAX_VALUE;
		int maxY = -1;

		for(int i = 0; i < 2; i++){
			int x1 = sc.nextInt() + OFFSET;
			int y1 = sc.nextInt() + OFFSET;
			int x2 = sc.nextInt() + OFFSET;
			int y2 = sc.nextInt() + OFFSET;
			if(i == 1){
				for(int j = y1; j <= y2; j++){
					for(int k = x1; k <= x2; k++){
						area[j][k] += 2;
					}
				}
			}else{
				for(int j = y1; j <= y2; j++){
					for(int k = x1; k <= x2; k++){
						area[j][k]++;
					}
				}
			}

		}

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[i].length; j++){
				if(area[i][j] == 1){
					minX = Math.min(minX, j);
					maxX = Math.max(maxX, j);
					minY = Math.min(minY, i);
					maxY = Math.max(maxY, i);
				}
			}
		}

		System.out.println((maxX - minX) * (maxY - minY));
    }
}