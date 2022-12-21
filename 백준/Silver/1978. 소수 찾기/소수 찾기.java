import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = 0;
        for(int i=0;i<total;i++){
            int a = sc.nextInt();
            if(a == 2){
                count ++;
            }
            else if(a > 2){
                int cnt=0;
                for(int j=2;j<a;j++){
                    if(a%j == 0){
                        cnt++;
                    }
                }
                if(cnt==0){
                    count++;
                }
            }   
        }
        System.out.println(count);
    }
}