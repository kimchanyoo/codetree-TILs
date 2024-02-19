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

		for(int i = 1; i < maxValueX; i++){
			for(int j = 1; j < maxValueY; j++){
				int count1 = 0;
				int count2 = 0;
				int count3 = 0;
				int count4 = 0;
				for(int k = 0; k < n; k++){
					if(x[k] > i && y[k] > j){
						count1++;
					}else if(x[k] < i && y[k] > j){
						count2++;
					}else if(x[k] < i && y[k] < j){
						count3++;
					}else{
						count4++;
					}
				}
				int maxCount = Math.max(Math.max(count1, count2), Math.max(count3, count4));
				min = Math.min(min, maxCount);
			}
		}
		System.out.println(min);
    }
}