import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int score = 0;
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<num-1;i++){
            score += arr[num-i-1] * arr[num-i-2];
            arr[num-i-2] = arr[num-i-1] + arr[num-i-2];
        }
        System.out.println(score);
    }
}