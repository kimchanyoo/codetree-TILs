import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int xDirection = Math.abs(a - x);
		int yDirection = Math.abs(a - y);
		int normal = Math.abs(a - b);
		int teleporting = 0;

		if(xDirection <= yDirection){
			teleporting = xDirection + Math.abs(b - y);
		}else{
			teleporting = yDirection + Math.abs(b - x);
		}

		System.out.println(Math.min(normal, teleporting));
    }
}