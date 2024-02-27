public class Main {
    static final int OFFSET = 100000;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] countList = new int[2 * OFFSET + 1];
		int[] area = new int[2 * OFFSET + 1];
		int start = 100000;
		int white = 0;
		int black = 0;
		int gray = 0;

		for(int i = 0; i < n; i++){
			int distance = sc.nextInt();
			char direction = sc.next().charAt(0);

			if(direction == 'R'){
				for(int j = start; j < start + distance; j++){
					if(area[j] == 1){
						white--;
						black++;
					}else if(area[j] == 100){
						countList[j]++;
						continue;
					}else{
						black++;
					}
					area[j] = 100;
					countList[j]++;
				}
				start += (distance - 1);
			}else{
				for(int j = start; j > start - distance; j--){
					if(area[j] == 100){
						black--;
						white++;
					}else if(area[j] == 1){
						countList[j]++;
						continue;
					}else{
						white++;
					}
					area[j] = 1;
					countList[j]++;
				}
				start -= (distance - 1);
			}
		}

		for(int i = 0; i < countList.length; i++){
			if(countList[i] >= 4){
				if(area[i] == 1){
					white--;
					gray++;
				}else if(area[i] == 100){
					black--;
					gray++;
				}
			}
		}

		System.out.println(white + " " + black + " " + gray);
    }
}