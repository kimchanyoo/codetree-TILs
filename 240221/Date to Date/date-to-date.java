import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 30, 30, 31, 30, 31};
		int count = (monthDays[m1 - 1] - d1) + d2 + 1;

		if(m1 + 1 != m2){
			for(int i = m1 + 1; i < m2; i++){
				count += monthDays[i - 1];
			}
		}

		System.out.println(count);
    }
}