import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        int time = 0;
        for(int i=0;i<num;i++){
            time += arr[i];
            ans += time;
        }
        System.out.println(ans);
    }
}