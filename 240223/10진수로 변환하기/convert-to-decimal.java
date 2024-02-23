import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strList = str.split("");
		int result = 0;

		for(int i = 0; i < strList.length; i++){
			int power = (int)(Math.pow(2, strList.length - i - 1));
			result += power * Integer.parseInt(strList[i]);
		}

		System.out.println(result);
    }
}