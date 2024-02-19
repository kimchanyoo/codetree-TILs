import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[][] game = new String[3][3];
		Set<String> result = new HashSet<>();
		Set<String> line = new HashSet<>();

		for(int i = 0; i < 3; i++){
			String num = sc.next();
			game[i] = num.split("");
		}

		for(int i = 0; i < 3; i++){
			line = new HashSet<>();
			line.add(game[i][0]);
			line.add(game[i][1]);
			line.add(game[i][2]);
			calculation(line, result);
		}

		for(int i = 0; i < 3; i++){
			line = new HashSet<>();
			line.add(game[0][i]);
			line.add(game[1][i]);
			line.add(game[2][i]);
			calculation(line, result);
		}

		for(int i = 0; i < 3; i += 2){
			line = new HashSet<>();
			if(i == 0){
				line.add(game[0][0]);
				line.add(game[1][1]);
				line.add(game[2][2]);
			}else{
				line.add(game[0][2]);
				line.add(game[1][1]);
				line.add(game[2][0]);
			}
			calculation(line, result);
		}

		System.out.println(result.size());
	}

	private static void calculation(Set<String> line, Set<String> result) {
		Iterator<String> it = line.iterator();

		if(line.size() == 2){
			StringBuilder temp = new StringBuilder();
			while(it.hasNext()){
				temp.append(it.next());
			}

			result.add(temp.toString());
		}
	}
}