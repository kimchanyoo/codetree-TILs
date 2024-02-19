import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[][] game = new String[3][3];
		int count = 0;

		for(int i = 0; i < 3; i++){
			String num = sc.next();
			game[i] = num.split("");
		}

		for(int i = 0; i < 3; i++){
			Set<String> width = new HashSet<>();
			width.add(game[i][0]);
			width.add(game[i][1]);
			width.add(game[i][2]);

			if(width.size() == 2){
				count++;
			}
		}

		for(int i = 0; i < 3; i++){
			Set<String> height = new HashSet<>();
			height.add(game[0][i]);
			height.add(game[1][i]);
			height.add(game[2][i]);

			if(height.size() == 2){
				count++;
			}
		}

		for(int i = 0; i < 3; i += 2){
			Set<String> diagonal = new HashSet<>();
			if(i == 0){
				diagonal.add(game[0][0]);
				diagonal.add(game[1][1]);
				diagonal.add(game[2][2]);
			}else{
				diagonal.add(game[0][2]);
				diagonal.add(game[1][1]);
				diagonal.add(game[2][0]);
			}
			if(diagonal.size() == 2){
				count++;
			}
		}

		System.out.println(count);
    }
}