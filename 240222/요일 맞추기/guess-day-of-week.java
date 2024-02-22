import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		String[] Reverseday = {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};
		String result = "";
		int elapsedDays = 0;

		if(m1 < m2){

			for(int i = m1; i < m2; i++){
				elapsedDays += monthDays[i];
			}

			elapsedDays -= d1;
			elapsedDays += d2;

			elapsedDays = elapsedDays % 7;
			result = day[elapsedDays];
		}else if(m1 > m2){

			for(int i = m2; i < m1; i++){
				elapsedDays += monthDays[i];
			}

			elapsedDays -= d2;
			elapsedDays += d1;

			elapsedDays = elapsedDays % 7;
			result = Reverseday[elapsedDays];
		}else{
			elapsedDays = d2 - d1;
			if(elapsedDays < 0){
				elapsedDays = Math.abs(elapsedDays) % 7;
				result = Reverseday[elapsedDays];
			}else{
				elapsedDays = elapsedDays % 7;
				result = day[elapsedDays];
			}
		}

		System.out.println(result);
    }
}