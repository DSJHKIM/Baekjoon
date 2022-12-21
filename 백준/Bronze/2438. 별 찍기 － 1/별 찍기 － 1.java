import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        StringBuilder star = new StringBuilder();
        for(int i=1;i<=total;i++){
            star.append("*");
            System.out.println(star);
        }
    }
}
