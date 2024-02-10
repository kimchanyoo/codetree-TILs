import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for(int i = 0; i < 3; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            arr2[i] = sc.nextInt();
        }
        
        if(n < 5){
            System.out.println(1);
        }else{
            int[] arr1FirstNumber = new int[5];
            int[] arr1SecondNumber = new int[5];
            int[] arr1ThirdNumber = new int[5];
            int[] arr2FirstNumber = new int[5];
            int[] arr2SecondNumber = new int[5];
            int[] arr2ThirdNumber = new int[5];

            calculationOfScope(n, arr1, arr1FirstNumber, 0);
            calculationOfScope(n, arr1, arr1SecondNumber, 1);
            calculationOfScope(n, arr1, arr1ThirdNumber, 2);
            calculationOfScope(n, arr2, arr2FirstNumber, 0);
            calculationOfScope(n, arr2, arr2SecondNumber, 1);
            calculationOfScope(n, arr2, arr2ThirdNumber, 2);

            int cntFirst = 0;
            int cntSecond = 0;
            int cntThird = 0;

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++) {
                    if (arr1FirstNumber[i] == arr2FirstNumber[j]) {
                        cntFirst++;
                        break;
                    }
                }
                for(int j = 0; j < 5; j++){
                    if(arr1SecondNumber[i] == arr2SecondNumber[j]){
                        cntSecond++;
                        break;
                    }
                }
                for(int j = 0; j < 5; j++){
                    if(arr1ThirdNumber[i] == arr2ThirdNumber[j]){
                        cntThird++;
                        break;
                    }
                }
            }
            
            System.out.println(250 - (cntFirst * cntSecond * cntThird));
        }
    }

    private static void calculationOfScope(int n, int[] arr, int[] numberRange, int sequence) {
        if(arr[sequence] == 1){
            int temp = n - 1;
            for(int i = 0; i < 5; i++) {
                if(i == 2){
                    temp = 1;
                }
                numberRange[i] = temp;
                temp++;
            }
        }else if(arr[sequence] == 2){
            int temp = n;
            for(int i = 0; i < 5; i++) {
                if(i == 1){
                    temp = 1;
                }
                numberRange[i] = temp;
                temp++;
            }
        }else if(arr[sequence] == n){
            int temp = arr[sequence] - 2;
            for(int i = 0; i < 5; i++){
                if(i == 3){
                    temp = 1;
                }
                numberRange[i] = temp;
                temp++;
            }
        }else if(arr[sequence] == n -1){
            int temp = arr[sequence] - 2;
            for(int i = 0; i < 5; i++){
                if(i == 4){
                    temp = 1;
                }
                numberRange[i] = temp;
                temp++;
            }
        }else{
            int temp = arr[sequence] - 2;
            for(int i = 0; i < 5; i++){
                numberRange[i] = temp;
                temp++;
            }
        }
    }
}