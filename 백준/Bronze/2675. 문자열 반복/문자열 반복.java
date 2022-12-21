import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i=0;i<total;i++){
            int repeat = sc.nextInt();
            String a = sc.next();
            String[] b = a.split("");
            for(int j=0;j<b.length;j++){
                for(int z=0;z<repeat;z++){
                    System.out.print(b[j]);
                }
            }
            System.out.println("");
        }
    }
}