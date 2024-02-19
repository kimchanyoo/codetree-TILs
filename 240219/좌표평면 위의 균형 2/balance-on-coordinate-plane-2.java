import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int maxValueX = 0;
		int maxValueY = 0;
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			maxValueX = Math.max(maxValueX, x[i]);
			maxValueY = Math.max(maxValueY, y[i]);
		}

		for(int i = 2; i <= 100; i += 2){
			for(int j = 2; j <= 100; j += 2){
				int cnt1 = 0;
				int cnt2 = 0;
				int cnt3 = 0;
				int cnt4 = 0;
				for(int k = 0; k < n; k++){
					if(x[k] > j && y[k] > i){
						cnt1++;
					}else if(x[k] > j && y[k] < i){
						cnt2++;
					}else if(x[k] < j && y[k] < i){
						cnt3++;
					}else{
						cnt4++;
					}
				}
				int maxCount = Math.max(cnt1, Math.max(cnt2, Math.max(cnt3, cnt4)));
				min = Math.min(min, maxCount);
			}
		}
		System.out.println(min);
    }
}