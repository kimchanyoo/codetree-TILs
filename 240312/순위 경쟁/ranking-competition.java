import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int count = 0;
		String rank = "ABC";

		for(int i = 0; i < n; i++){
			char m = sc.next().charAt(0);
			int s = sc.nextInt();
			if(m == 'A'){
				a += s;
			}else if(m == 'B'){
				b += s;
			}else if(m == 'C'){
				c += s;
			}
			
			if((a > b && a > c) && !rank.equals("A")){
				count++;
				rank = "A";
			}else if((c > b && c > a) && !rank.equals("C")){
				count++;
				rank = "C";
			}else if(b > a && b > c  && !rank.equals("B")){
				count++;
				rank = "B";
			}else if(a == b && a > c && !rank.equals("AB")){
				count++;
				rank = "AB";
			}else if(a > b && a == c && !rank.equals("AC")){
				count++;
				rank = "AC";
			}else if(a < b && b == c && !rank.equals("BC")){
				count++;
				rank = "BC";
			}else if(a == b && b == c && !rank.equals("ABC")){
				count++;
				rank = "ABC";
			}
		}

		System.out.println(count);
    }
}