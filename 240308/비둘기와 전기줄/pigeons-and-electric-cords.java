import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] pigeonList = new int[10];
		int count = 0;
		for(int i = 0; i < n; i++){
			int pigeon = sc.nextInt() - 1;
			int location = sc.nextInt() + 1;
			if(pigeonList[pigeon] != location && pigeonList[pigeon] != 0){
				count++;
			}
			pigeonList[pigeon] = location;
		}

		System.out.println(count);
    }
}