import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		String rank = "";
		int count = 0;

		for(int i = 0; i < n; i++){
			char c = sc.next().charAt(0);
			int s = sc.nextInt();
			if(c == 'A'){
				a += s;
			}else if(c == 'B'){
				b += s;
			}
			if(a > b && !rank.equals("A")){
				rank = "A";
				count++;
			}else if(a < b && !rank.equals("B")){
				rank = "B";
				count++;
			}else if(a == b && !rank.equals("AB") && a != 0){
				rank = "AB";
				count++;
			}
		}

		System.out.println(count);
    }
}