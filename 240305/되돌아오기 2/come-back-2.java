public class Main {
    static int[] dx = new int[]{0, 1, 0, -1};
	static int[] dy = new int[]{-1, 0, 1, 0};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] strList = sc.next().split("");
		int x = 0, y = -1;
		int result = -1;
		int dirNum = 0;

		for(int i = 1; i < strList.length; i++){
			if(strList[i].equals("L")){
				if(dirNum == 0){
					dirNum = 3;
				}else{
					dirNum -= 1;
				}
			}
			else if(strList[i].equals("R")){
				if(dirNum == 3){
					dirNum = 0;
				}else{
					dirNum += 1;
				}
			}else if(strList[i].equals("F")){
				x += dx[dirNum];
				y += dy[dirNum];
			}

			if(x == 0 && y == 0){
				result = i + 1;
				break;
			}
		}

		System.out.println(result);
	}
}