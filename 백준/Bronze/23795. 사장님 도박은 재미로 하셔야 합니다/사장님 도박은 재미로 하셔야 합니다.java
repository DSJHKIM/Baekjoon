import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 판돈 배열
        int[] wastedmoney = new int[1999];
        for(int i=0;i<wastedmoney.length;i++){
            wastedmoney[i] = scanner.nextInt();
            if(wastedmoney[i] == -1){
                break;
            }
        }
        scanner.close();

        // 판돈합계 넣을곳
        int wastedmoneyall = 1;
        
        for(int i=0;i<wastedmoney.length;i++){
            wastedmoneyall = wastedmoneyall + wastedmoney[i];
        }

        System.out.println(wastedmoneyall);
    }
}
