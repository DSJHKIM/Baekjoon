import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=num;i++){
            if(i==1000){
                break;
            }
            if(i<100){
                ans++;
            }
            else{
                int a = i/100;
                int b = (i%100)/10;
                int c = i%10;
                if(a-b == b-c){
                    ans++;
                } 
            }
        }
        System.out.println(ans);
        sc.close();
    }
}