import java.util.Scanner;

public class Main {
    static String[] rps = {"scissors", "rock", "paper", "scissors", "paper", "rock",
			"rock", "paper", "scissors", "paper", "rock", "scissors",
			"paper", "scissors", "rock", "rock", "scissors", "paper"};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
		}

		count1 = countWin(x, y, 0, n);
		count2 = countWin(x, y, 1, n);
		count3 = countWin(x, y, 2, n);
		count4 = countWin(x, y, 3, n);
		count5 = countWin(x, y, 4, n);
		count6 = countWin(x, y, 5, n);

		System.out.println(Math.max(Math.max(count1, Math.max(count2, count3)),
				Math.max(count4, Math.max(count5, count6))));
	}
	private static int countWin(int[] x, int[] y, int num, int n){
		int count = 0;
		for(int i = 0; i < n; i++){
			String first = rps[3 * num + x[i]];
			String second = rps[3 * num + y[i]];
			if(first.equals("scissors") && second.equals("paper")){
				count++;
			}else if(first.equals("rock") && second.equals("scissors")){
				count++;
			}else if(first.equals("paper") && second.equals("rock")){
				count++;
			}
		}
		return count;
	}
}