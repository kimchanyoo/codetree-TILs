import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i = x; i <= y; i++){
            int sum = sumOfLange(i);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
    private static int sumOfLange(int x){
        int sum = 0;
        String number = String.valueOf(x);
        String[] numList = number.split("");

        for(String s : numList){
            sum += Integer.parseInt(s);
        }

        return sum;
    }
}

/*
속도 개선 버전
    import java.util.Scanner;

public class Main {
    public static int x, y;

    public static int cal(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt(); y = sc.nextInt();
        int max_sum = 0;
        for (int i = x; i <= y; i++) 
            max_sum = Math.max(max_sum, cal(i));
        System.out.print(max_sum);
    }
}
*/
