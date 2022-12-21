import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        for(int i=1;i<=total;i++){
            for(int j=total-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int x=1;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}