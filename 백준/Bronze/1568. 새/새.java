import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int cnt = 0;
        while(true){
            k++;
            cnt++;
if(n >= k){
                n -= k;
            }else{
                k = 1;
                n -= k;
            }
            if(n == 0){
                System.out.println(cnt);
                break;
            }
        }
    }
}