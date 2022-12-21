import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fix = sc.nextInt();
        int move = sc.nextInt();
        int price = sc.nextInt();
        
        if(price <= move){
            System.out.println(-1);
        }
        else{
            System.out.println(fix/(price-move)+1);
        }
    }    
}