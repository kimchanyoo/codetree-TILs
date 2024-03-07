import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int overlapping = 0;

		if(c < b && a < c){
			if(d < b){
				overlapping = d - c;
			}else{
				overlapping = b - c;
			}
		}else if(a < d && c < a){
			if(b < d){
				overlapping = b - a;
			}else{
				overlapping = d - a;
			}
		}else if(a == c && b == d){
			overlapping = b - a;
		}

		System.out.println((b - a) + (d - c) - (overlapping));
    }
}