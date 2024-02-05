import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		int max = Integer.MIN_VALUE;
		HashMap<Integer, String> map = new HashMap<>();

		for(int i = 0; i < n; i++){
			map.put(sc.nextInt(), sc.next());
		}

		Object[] mapKey = map.keySet().toArray();
		Arrays.sort(mapKey);
		if(n == 1){
			if(map.get((Integer) mapKey[0]).equals("G")){
				max = 1;
			}else if(map.get((Integer) mapKey[0]).equals("H")){
				max = 2;
			}
		}else{
			for(int i = 0; i < n - 1; i++){
				if(map.get((Integer) mapKey[i]).equals("G")){
					sum = 1;
				}else if(map.get((Integer) mapKey[i]).equals("H")){
					sum = 2;
				}
				int location = i + 1;
				for(int j = i + 1; j < n; j++){
					if((int)mapKey[j] - (int)mapKey[i] <= k){
						if(map.get((Integer) mapKey[location]).equals("G")){
							sum += 1;
						}else if(map.get((Integer) mapKey[location]).equals("H")){
							sum += 2;
						}
						location++;
					}else{
						break;
					}
				}
				max = Math.max(max, sum);
			}
		}
		
		System.out.println(max);
    }
}