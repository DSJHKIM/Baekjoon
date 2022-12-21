import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yt = sc.nextInt();
        int yj = sc.nextInt();
        int i=0;
        while(true){
            i++;
            if(i%2 == 1){
                yj += yt;
                if(yj >= 5){
                    System.out.println("yt");
                    break;
                }
            }
            else{
                yt += yj;
                if(yt >= 5){
                    System.out.println("yj");
                    break;
                }
            }
        }
    }
}