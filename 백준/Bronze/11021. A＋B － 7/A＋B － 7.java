import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=scanner.nextInt();
        for(int i=0;i<total;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #"+ (i+1) +": "+ (a+b));
        }
    }
}
