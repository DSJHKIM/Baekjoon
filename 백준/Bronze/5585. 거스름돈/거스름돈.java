import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        int money = 1000 - pay;
        int cnt = 0;
        while(money != 0){
            cnt ++;
            if(money >= 500){
                money -= 500;
            }else if(money >= 100){
                money -= 100;
            }else if(money >= 50){
                money -= 50;
            }else if(money >= 10){
                money -= 10;
            }else if(money >= 5){
                money -= 5;
            }else{
                money --;
            }
        }
        System.out.println(cnt);
    }
}