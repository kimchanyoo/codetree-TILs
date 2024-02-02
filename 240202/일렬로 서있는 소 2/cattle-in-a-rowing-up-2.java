import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] AList = new int[N];
		int cnt = 0;
		for(int i = 0; i < N; i++){
			AList[i] = sc.nextInt();
		}

		for(int i = 0; i < N -2; i++){
			for(int j = i + 1; j < N - 1; j++){
				for(int k = j + 1; k < N; k++){
					if(AList[i] < AList[j] && AList[j] < AList[k]){
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
    }
}