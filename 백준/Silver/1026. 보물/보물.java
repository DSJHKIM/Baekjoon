import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        for(int i=0;i<num;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<num/2;i++){
            int temp = b[i];
            b[i] = b[num-i-1];
            b[num-i-1] = temp;
        }
        int ans = 0;
        for(int i=0;i<num;i++){
            ans += a[i]*b[i];
        }
        System.out.println(ans);
    }
}