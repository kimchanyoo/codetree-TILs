import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int minute = (1440 * a + 60 * b + c) - (1440 * 11 + 60 * 11 + 11);

		if(minute < 0){
			minute = -1;
		}

		System.out.println(minute);
    }
}