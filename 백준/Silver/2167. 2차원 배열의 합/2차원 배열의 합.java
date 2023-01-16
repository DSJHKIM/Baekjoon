import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            int ans = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=a-1;j<=x-1;j++){
                for(int k=b-1;k<=y-1;k++){
                    ans += arr[j][k];
                }
            }
            System.out.println(ans);
        }

    }
}