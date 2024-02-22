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

		int days = m1 != m2 ? MONTHS[m1] - d1 + 1 + sumArray(MONTHS, m1 + 1, m2 - 1) + d2 : d2 - d1 + 1;

		if (getIndex(WEEKEND, week) + 1 <= (days % 7) && days > 7) {
			System.out.println(days / 7 + 1);
		} else if (days < 7) {
			if (getIndex(WEEKEND, week) + 1 <= (days % 7)) {
				System.out.println(1);
			}
		} else {
			System.out.println(days / 7);
		}
	}

	public static int sumArray(int[] arr, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
		return sum;
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