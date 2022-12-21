import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int ii = 1;
        int jj = 1;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    ii = i+1;
                    jj = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(ii + " " + jj);
    }
}