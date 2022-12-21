import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num3 = num;
        int len = 0;
        while(true){
            len ++;
            int num2 = (num3%10)*10 + (num3/10+num3%10)%10;
            if(num2 == num){
                System.out.println(len);
                break;
            }
            num3 = num2;
        }

    }
}