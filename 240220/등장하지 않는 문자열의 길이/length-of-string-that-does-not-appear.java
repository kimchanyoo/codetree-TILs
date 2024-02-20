import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int count = 1;
		int strLength = str.length();

		while(true){
			boolean isPresent = false;
			for(int i = 0; i <= strLength - count; i++){
				String[] tempList = str.split("");
				String replace1 = "";
				String replace2 = "";
				int tempCount = 0;

				for(int j = i; j < i + count; j++){
					replace1 += tempList[j];
				}

				for(int j = 0; j <= strLength - count; j++){
					replace2 = "";
					for(int k = j; k < j + count; k++){
						replace2 += tempList[k];
					}
					if(replace1.equals(replace2)){
						tempCount++;
					}
					if(tempCount == 2){
						count++;
						isPresent = true;
						break;
					}
				}
			}
			if(!isPresent){
				break;
			}
		}

		System.out.println(count);
	}
}