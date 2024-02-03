import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String[] strList = str.split("");
		int cnt = 0;

		for(int i = 0; i < n - 2; i++){
			if(strList[i].equals("C")){
				for(int j = i + 1; j < n - 1; j++){
					if(strList[j].equals("O")){
						for(int k = j + 1; k < n; k++){
							if(strList[k].equals("W")){
								cnt++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(cnt);
    }
}