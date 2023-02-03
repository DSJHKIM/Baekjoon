import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];
        for(int i=0;i<n;i++){
            String[] arr2 = sc.next().split("");
            for(int j=0;j<m;j++){
                arr[i][j] = arr2[j];
            }
        } 
        int cnt1 = 0;
        int[] cnt2 = new int[m];
        int cnt3 = 0;
        for(int i=0;i<n;i++){
            int chk = 0;
            for(int j=0;j<m;j++){
                if(arr[i][j].equals("X")){
                    chk++;
                    cnt2[j]++;
                }
            }
            if(chk == 0){
                cnt1++;
            }
        }
        for(int i=0;i<m;i++){
            if(cnt2[i] == 0){
                cnt3++;
            }
        }
        if(cnt3 > cnt1){
            System.out.println(cnt3);
        }else{
            System.out.println(cnt1);
        }
    }
}