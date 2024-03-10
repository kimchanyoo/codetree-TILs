import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count1 = 0, count2 = 0;

		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();

			if(x > y){
				count1++;
			}else if(x < y){
				count2++;
			}
		}

		System.out.println(Math.max(count1, count2));
    }
}