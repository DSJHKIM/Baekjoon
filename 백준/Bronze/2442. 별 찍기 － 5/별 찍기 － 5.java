import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int z=0;z<n-i;z++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<i;k++){
                System.out.print("**");
            }
            System.out.println();
        }
    }
}