import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 피보나치수 구하기
        int[] arr = new int[a+1];
        arr[0]=0;
        arr[1]=1;
        if(a==0){
            System.out.println(0);
        }
        else if(a==1){
            System.out.println(1);
        }
        else{
            for(int i=2;i<=a;i++){
                arr[i] = arr[i-2]+arr[i-1];
                if(i==a){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}