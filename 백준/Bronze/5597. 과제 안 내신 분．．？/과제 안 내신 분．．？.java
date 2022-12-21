import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        arr[29] = 0;
        arr[28] = 0;
        for(int i=0;i<28;i++){
            if(arr[i] != 1){
                arr[i] = 0;
            }
            int num = sc.nextInt();
            arr[num-1] = 1;
        }
        for(int i=0;i<30;i++){
            if(arr[i] == 0){
                System.out.println(i+1);
            }
        }
        sc.close();
    }
}