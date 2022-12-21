import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = sc.nextInt();
        int ans = 0;
        int num1 = num / 100 * 100;
        while(true){
            if(num1%f == 0){
                if(ans < 10){
                    System.out.println("0"+ans);
                }
                else{
                    System.out.println(ans);
                }
                break;
            }
            num1++;
            ans++;
        }
    }
}