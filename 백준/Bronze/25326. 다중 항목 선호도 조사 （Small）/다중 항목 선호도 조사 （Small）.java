import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.next();
            }
        }

        String[] arr1 = new String[3]; 

        for(int i=0;i<m;i++){
            arr1[0]=sc.next();
            arr1[1]=sc.next();
            arr1[2]=sc.next();
            int cnt = 0;
            for(int j=0;j<n;j++){
                int cnt1 = 0;
                if(arr1[0].equals(arr[j][0]) || arr1[0].equals("-")){
                    cnt1++;
                }
                if(arr1[1].equals(arr[j][1]) || arr1[1].equals("-")){
                    cnt1++;
                }
                if(arr1[2].equals(arr[j][2]) || arr1[2].equals("-")){
                    cnt1++;
                }
                if(cnt1==3){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}