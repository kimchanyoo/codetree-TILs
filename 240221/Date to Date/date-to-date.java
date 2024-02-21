import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int elapsedDays = 1;

		for(int i = m1; i < m2; i++){
			elapsedDays += monthDays[i];
		}

		elapsedDays -= d1;
		elapsedDays += d2;

		System.out.println(elapsedDays);
    }
}