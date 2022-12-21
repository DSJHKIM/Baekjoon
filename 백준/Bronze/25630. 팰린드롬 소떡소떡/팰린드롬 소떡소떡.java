import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        String st = sc.next();
        String[] arr = st.split("");
        int len = 0;
        int b = arr.length;
        int cnt = 0;
        for(int i=0;i<total/2;i++){
            if(!arr[i].equals(arr[b-1])){
                cnt++;
            }
            b--;
        }
        System.out.println(cnt);
    }
}