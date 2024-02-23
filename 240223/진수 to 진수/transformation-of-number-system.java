import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] strList = sc.next().split("");
		int[] resultList = new int[20];
		int result = 0;
		int cnt = 0;

		for(int i = 0; i < strList.length; i++){
			int power = (int)(Math.pow(a, strList.length - i - 1));
			result += power * Integer.parseInt(strList[i]);
		}

		while(true){
			if(result < b){
				resultList[cnt++] = result;
				break;
			}

			resultList[cnt++] = result % b;
			result /= b;
		}

		for(int i = cnt - 1; i >= 0; i--){
			System.out.print(resultList[i]);
		}
    }
}