import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int num = i;
            int sum = 0;
            while(num>0){
                sum += num%10;
                num /= 10;
            }
            if(i+sum == a){
                System.out.println(i);
                break;
            }
            else if(i==a-1 && i+sum!=a){
                System.out.println(0);
            }
        }

    }
}