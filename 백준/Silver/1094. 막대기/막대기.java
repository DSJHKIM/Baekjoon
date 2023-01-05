import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int size = 64;
        int ans = 0;
        while(a>0){
            if(size>a){
                size /= 2;
            }
            else{
                ans++;
                a -= size;
            }
        }
        System.out.println(ans);
    }
}