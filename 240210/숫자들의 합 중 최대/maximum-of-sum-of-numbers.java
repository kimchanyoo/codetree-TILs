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