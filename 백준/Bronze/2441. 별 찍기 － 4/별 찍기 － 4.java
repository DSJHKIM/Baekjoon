import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int m = 0;
        for(int i=0;i<n;i++){
            for(int z=0;z<m;z++){
                System.out.print(" ");
            }
            for(int j=k;j>=1;j--){
                System.out.print("*");
            }
            k --;
            m ++;
            System.out.println();
        }
    }
}