import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		String a = sc.next();

		int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		int elapsedDays = 0;
		int count = 0;

		for(int i = m1; i < m2; i++){
			elapsedDays += monthDays[i];
		}

		elapsedDays -= d1;
		elapsedDays += d2;

		count = elapsedDays / 7;
		if(a.equals(day[elapsedDays % 7])){
			count++;
		}

		System.out.println(count);
    }
}