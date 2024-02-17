import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;

		for(int i = x; i < y + 1; i++){
			String num = String.valueOf(i);
			String[] numList = num.split("");
			int size = num.length() / 2;
			boolean isNumber = true;

			for(int j = 0; j < size; j++){
				if (!numList[j].equals(numList[numList.length - j - 1])) {
					isNumber = false;
					break;
				}
			}

			if(isNumber){
				count++;
			}
		}

		System.out.println(count);
    }
}