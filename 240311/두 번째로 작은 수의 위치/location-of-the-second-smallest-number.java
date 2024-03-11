import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numList = new int[n];
		int[] number = new int[101];

		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
			number[numList[i]]++;
		}

		int count = 0;
		int target = 0;
		int result = 0;
		boolean isPresent = false;
		for(int i = 0; i <number.length; i++){
			 if(number[i] != 0){
				 count++;
			 }
			 if(count == 2){
				 target = i;
				 break;
			 }
		}

		for(int i = 0; i < numList.length; i++){
			if(target == numList[i] && number[target] == 1){
				result = i + 1;
				isPresent = true;
				break;
			}
		}

		if(isPresent){
			System.out.println(result);
		}else{
			System.out.println(-1);
		}
    }
}