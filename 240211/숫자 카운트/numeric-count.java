import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] question = new int[n][5];
        int result = 0;

        for(int i =0; i < n; i++){
            int num = sc.nextInt();
            question[i][0] = num / 100;
            question[i][1] = (num / 10) % 10;
            question[i][2] = num % 10;
            question[i][3] = sc.nextInt();
            question[i][4] = sc.nextInt();
        }

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                for(int k = 1; k < 10; k++){
                    if(i == j || j == k || i == k){
                        continue;
                    }

                    int cnt = 0;
                    for(int e = 0; e < n; e++){
                        int strikeCnt = 0;
                        int ballCnt = 0;

                        if(i == question[e][0]){
                            strikeCnt++;
                        }else if(i == question[e][1] || i == question[e][2]){
                            ballCnt++;
                        }

                        if(j == question[e][1]){
                            strikeCnt++;
                        }else if(j == question[e][0] || j == question[e][2]){
                            ballCnt++;
                        }

                        if(k == question[e][2]){
                            strikeCnt++;
                        }else if(k == question[e][0] || k == question[e][1]){
                            ballCnt++;
                        }

                        if(strikeCnt == question[e][3] && ballCnt == question[e][4]){
                            cnt++;
                        }else{
                            break;
                        }
                    }

                    if(cnt == n){
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}