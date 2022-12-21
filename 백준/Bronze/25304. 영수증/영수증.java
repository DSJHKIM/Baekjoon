import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int price2 = 0;
        int cnt = sc.nextInt();
        for(int i=0;i<cnt;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            price2 = price2 + (a*b);
        }
        if(price == price2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}