import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] developerList = new int[6];
		boolean[] developerCheckList = new boolean[6];
		int diff = Integer.MAX_VALUE;

		for(int i = 0; i < 6; i++){
			developerList[i] = sc.nextInt();
		}

		for(int i = 1; i <= 5; i++){
			for(int j = 1; j < 5; j++){
				if(i == j){
					continue;
				}
				for(int k = j + 1; k < 5; k++){
					if(developerCheckList[k]){
						continue;
					}
					int max = 0;
					int min = -1;
					int firstGroup = developerList[0] + developerList[i];
					int secondGroup = developerList[j];
					int thirdGroup = 0;
					developerCheckList[0] = true;
					developerCheckList[i] = true;
					developerCheckList[j] = true;


					if(!developerCheckList[k]){
						secondGroup += developerList[k];
						developerCheckList[k] = true;
					}

					for(int e = 1; e < 6; e++){
						if(!developerCheckList[e]){
							thirdGroup += developerList[e];
						}else{
							developerCheckList[e] = false;
						}
					}

					max = Math.max(Math.max(firstGroup, secondGroup), thirdGroup);
					min = Math.min(Math.min(firstGroup, secondGroup), thirdGroup);

					diff = Math.min(diff, max - min);
				}
			}
		}

		System.out.println(diff);
    }
}