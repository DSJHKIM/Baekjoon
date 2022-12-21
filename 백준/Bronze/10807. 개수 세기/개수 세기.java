import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<len;i++){
            if(arr[i] == num){
                cnt ++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}