import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int count = 1;
		int strLength = str.length();

		while(true){
			boolean isPresent = false;
			for(int i = 0; i <= strLength - count; i++){
				String temp = str;
				String[] tempList = temp.split("");
				StringBuilder replace = new StringBuilder();
				for(int j = i; j < i + count; j++){
					replace.append(tempList[j]);
				}
				temp = temp.replaceAll(replace.toString(), "");
				if(temp.length() == strLength - (count * 2)){
					count++;
					isPresent = true;
					break;
				}
			}
			if(!isPresent){
				break;
			}
		}

		System.out.println(count);
    }
}