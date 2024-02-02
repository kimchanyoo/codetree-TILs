import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char[] aList = A.toCharArray();
		int cnt = 0;

		for(int i = 0; i < aList.length - 1; i++){
			if(aList[i] == '('){
				for(int j = i + 1; j < aList.length; j++){
					if(aList[j] == ')'){
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}