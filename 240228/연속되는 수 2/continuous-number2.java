import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int count = 0;
		int max = -1;

		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			if(i == 0){
				count = 1;
			}else{
				if(temp == num){
					count++;
				}else{
					count = 1;
				}
			}
            max = Math.max(max, count);
			temp = num;
		}

		System.out.println(max);
    }
}