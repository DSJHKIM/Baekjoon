import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i==0 && p==200){
                System.out.println(0);
                break;
            }
            cnt ++;
            p=p+arr[i];
            if(p>=200){
                System.out.println(cnt);
                break;
            }
            if(i==n-1){
                System.out.println(cnt);
            }
        }
    }
}