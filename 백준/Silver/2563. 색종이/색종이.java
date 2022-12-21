import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int len = sc.nextInt();
        for(int i=0;i<len;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int aa=a;aa<a+10;aa++){
                for(int bb=b;bb<b+10;bb++){
                    arr[aa][bb] = 1;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j] == 1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}