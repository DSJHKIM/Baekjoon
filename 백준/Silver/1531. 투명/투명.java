import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[100][100];
        for(int i=0;i<n;i++){
            int[] arr2 = new int[4];
            arr2[0] = sc.nextInt();
            arr2[1] = sc.nextInt();
            arr2[2] = sc.nextInt();
            arr2[3] = sc.nextInt();
            for(int x=arr2[0]-1;x<arr2[2];x++){
                for(int y=arr2[1]-1;y<arr2[3];y++){
                    arr[x][y] ++;
                }
            }
        }
        int answer = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j] > m){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}