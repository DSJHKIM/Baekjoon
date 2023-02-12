
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[][] arr = new String[a][b];
        for(int i=0;i<a;i++){
            String[] str = sc.next().split("");
            for(int j=0;j<b;j++){
                arr[i][j] = str[j];
            }
        }
        int[] answer = new int[5];
        for(int i=0;i<a-1;i++){
            for(int j=0;j<b-1;j++){
                int cnt = 0;
                Boolean bool = false;
                if(arr[i][j].equals("#")){
                    bool = true;
                }else if(arr[i][j].equals("X")){
                    cnt++;
                }
                if(arr[i+1][j].equals("#")){
                    bool = true;
                }else if(arr[i+1][j].equals("X")){
                    cnt++;
                }
                if(arr[i][j+1].equals("#")){
                    bool = true;
                }else if(arr[i][j+1].equals("X")){
                    cnt++;
                }
                if(arr[i+1][j+1].equals("#")){
                    bool = true;
                }else if(arr[i+1][j+1].equals("X")){
                    cnt++;
                }
                if(bool == false){
                    answer[cnt] ++;
                }
            }
        }
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}