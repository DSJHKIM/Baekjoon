import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i=0;i<8;i++){
            String[] arr = sc.next().split("");
            if(i%2 == 0){
                for(int j=0;j<8;j++){
                    if(arr[j].equals("F") && j % 2 == 0){
                        cnt++;
                    }
                }
            }
            else{
                for(int j=0;j<8;j++){
                    if(arr[j].equals("F") && j % 2 != 0){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}