import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;

		for(int i = x; i < y + 1; i++){
			String str = String.valueOf(i);
			String[] strList = str.split("");
			int[] numbers = new int[10];
			boolean isInteresting = true;

			for (String s : strList) {
				numbers[Integer.parseInt(s)] += 1;
			}

			int[] sortedArray = IntStream.of(numbers)
					.boxed()
					.sorted(Comparator.reverseOrder())
					.mapToInt(Integer::intValue)
					.toArray();

			if(strList.length - sortedArray[0] != 1){
				isInteresting = false;
			}

			if(isInteresting){
				count++;
			}
		}

		System.out.println(count);
    }
}