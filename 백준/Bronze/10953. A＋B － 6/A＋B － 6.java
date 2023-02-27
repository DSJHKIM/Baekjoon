import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for(int i=0;i<len;i++){
            String[] arr = sc.next().split(",");
            System.out.println(Integer.valueOf(arr[0])+ Integer.valueOf(arr[1]));
        }
    }
}