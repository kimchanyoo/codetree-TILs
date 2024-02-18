import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numList = new int[n];
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++){
			numList[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				ArrayList<Integer> tempList = new ArrayList<>();
				for(int k : numList){
					tempList.add(k);
				}
				tempList.set(i, tempList.get(i) * 2);
				int sum = 0;
				tempList.remove(j);

				for(int k = 0; k < tempList.size() - 1; k++){
					sum += Math.abs(tempList.get(k) - tempList.get(k + 1));
				}
				min = Math.min(min, sum);
			}
		}
		System.out.println(min);
    }
}