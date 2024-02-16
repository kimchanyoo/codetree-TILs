import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer> s = new ArrayList<>();
		ArrayList<Integer> n = new ArrayList<>();
		int count = 0;

		for(int i = 0; i < t; i++){
			String str = sc.next();
			if(str.equals("S")){
				s.add(sc.nextInt());
			}else if(str.equals("N")){
				n.add(sc.nextInt());
			}
		}

		for(int i = a; i < b + 1; i++){
			int d1 = Integer.MAX_VALUE;
			int d2 = Integer.MAX_VALUE;

			for (Integer integer : s) {
				d1 = Math.min(d1, Math.abs(integer - i));
			}

			for (Integer integer : n) {
				d2 = Math.min(d2, Math.abs(integer - i));
			}

			if(d1 <= d2){
				count++;
			}
		}

		System.out.println(count);
    }
}