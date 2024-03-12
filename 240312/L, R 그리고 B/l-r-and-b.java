import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[][] arr = new char[10][10];
		int bHeight = 0;
		int lHeight = 0;
		int rHeight = 0;
		int bWidth = 0;
		int lWidth = 0;
		int rWidth = 0;

		for(int i = 0; i < 10; i++){
			arr[i] = sc.next().toCharArray();
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(arr[i][j] == 'B'){
					bHeight = i + 1;
					bWidth = j + 1;
				}else if(arr[i][j] == 'L'){
					lHeight = i + 1;
					lWidth = j+ 1;
				}else if(arr[i][j] == 'R'){
					rHeight = i + 1;
					rWidth = j + 1;
				}
			}
		}

		if((bHeight == rHeight && lHeight == rHeight) ||
				(bWidth == rWidth && lWidth == rWidth)){
			System.out.println(Math.abs(bHeight - lHeight) +
					Math.abs(bWidth - lWidth) + 1);
		}else{
			System.out.println(Math.abs(bHeight - lHeight) +
					Math.abs(bWidth - lWidth) - 1);
		}
    }
}