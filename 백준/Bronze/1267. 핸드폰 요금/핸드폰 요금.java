import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int yprice = 0;
        int mprice = 0;
        for(int i=0;i<total;i++){
            int sec = sc.nextInt();
            yprice = yprice + 10 + 10*(sec/30);
            mprice = mprice + 15 + 15*(sec/60);
        }
        
        if(yprice>mprice){
            System.out.println("M " + mprice);
        }
        else if(yprice==mprice){
            System.out.println("Y M " + mprice);
        }
        else{
            System.out.println("Y " + yprice);
        }
    }
}