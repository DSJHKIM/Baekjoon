import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int len = sc.nextInt();
            if(len == 0){
                break;
            }
            int[] arr = new int[len];
            int cnt = 0;
            for(int i=0;i<len;i++){
                arr[i] = sc.nextInt();
            }
            for(int j=1;j<len-1;j++){
                if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}