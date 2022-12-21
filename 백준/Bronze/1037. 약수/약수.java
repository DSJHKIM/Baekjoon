import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr = new int[total];
        for(int i=0;i<total;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[0]*arr[total-1]);
    }
}