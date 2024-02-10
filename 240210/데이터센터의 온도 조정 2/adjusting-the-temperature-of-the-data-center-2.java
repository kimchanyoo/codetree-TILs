import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[][] equipment = new int[n][2];
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                equipment[i][j] = sc.nextInt();
                if(j == 0){
                    start = Math.min(start, equipment[i][j]);
                }else{
                    end = Math.max(end, equipment[i][j]);
                }
            }
        }

        for(int i = start; i <= end; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(equipment[j][0] <= i && i <= equipment[j][1]){
                    sum += g;
                }else if(i < equipment[j][0]){
                    sum += c;
                }else if(equipment[j][1] < i){
                    sum += h;
                }
            }
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}