import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        h = h + ((m + a)/60);
        if(h >= 24){
            h = h-24;
        }
        m = m + a;
        if(m >= 60){
            m = m%60;
        }
        System.out.println(h + " " + m);

        sc.close();
    }
}