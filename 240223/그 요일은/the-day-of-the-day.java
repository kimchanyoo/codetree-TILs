import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		int[] MONTHS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] WEEKEND = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int m1 = Integer.parseInt(input[0]);
		int d1 = Integer.parseInt(input[1]);
		int m2 = Integer.parseInt(input[2]);
		int d2 = Integer.parseInt(input[3]);
		String week = scanner.nextLine();
		int elapsedDays = 0;
		int count = 0;
		int index = getIndex(WEEKEND, week);

		if(m1 < m2){
			for(int i = m1; i < m2; i++){
				elapsedDays += MONTHS[i];
			}

			elapsedDays -= d1;
			elapsedDays += d2;

		}else{
			elapsedDays = d2 - d1;
		}

		while(elapsedDays > 0){
			if(elapsedDays - 7 > 0){
				count++;
			}else{
				if(elapsedDays - index >= 0){
					count++;
				}
			}
			elapsedDays -= 7;
		}
		System.out.println(count);
	}

	public static int getIndex(String[] arr, String value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
}