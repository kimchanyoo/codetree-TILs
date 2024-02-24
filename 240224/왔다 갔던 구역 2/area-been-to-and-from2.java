import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		String[] direction = new String[n];
		int[] line = new int[2001];
		int location = 1000;
		int count = 0;

		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			direction[i] = sc.next();
		}

		for(int i = 0; i < n; i++){
			if(direction[i].equals("L")){
				for(int j = location; j > location - x[i]; j--){
					line[j]++;
				}
				location = location - x[i];
			}else if(direction[i].equals("R")){
				for(int j = location; j < location + x[i]; j++){
					line[j]++;
				}
				location = location + x[i];
			}
		}

		boolean isPresent = false;
		for(int i = 0; i < line.length; i++){
			if(line[i] >= 2 && !isPresent){
				isPresent = true;
				count--;
			}else if(line[i] < 2){
				isPresent = false;
			}

			if(isPresent){
				count++;
			}
		}

		System.out.println(count);
    }
}