import java.io.*;
import java.util.*;

public class Main {

    static int[] x;
    static int[] y;
    static int[][] xy;
    static String[] s = {"xxx", "xxy", "xyx", "yxx", "yyy", "yyx", "yxy", "xyy"};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        x = new int[n];
        y = new int[n];
        xy = new int[11][11];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            xy[x[i]][y[i]] = 1;
        }

        for(int i = 0; i < s.length; i++) {
            char c1 = s[i].charAt(0);
            char c2 = s[i].charAt(1);
            char c3 = s[i].charAt(2);

            for(int j = 0; j <= 5; j++) {
                for(int k = 0; k <= 5; k++) {
                    for(int l = 0; l <= 5; l++) {
                        if(j == k || k == l || j == l) continue;
                        int sum = 0;

                        sum += go(j, c1);
                        sum += go(k, c2);
                        sum += go(l, c3);

                        if(sum == n) {
                            System.out.println(1);
                            System.exit(0);
                        }
                    }
                }
            }
        }

        System.out.println(0);
    }
    static int go(int n, char ch) {
        int sum = 0;
        if(ch == 'x') {
            for(int i = 0; i <= 10; i++) {
                sum += xy[i][n];
            }
        } else {
            for(int i = 0; i <= 10; i++) {
                sum += xy[n][i];
            }
        }

        return sum;
    }
}