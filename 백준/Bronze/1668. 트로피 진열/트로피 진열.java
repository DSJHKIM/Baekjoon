import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int a = 1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1] > max){
                a ++;
                max = arr[i+1]; 
            }
        }
        System.out.println(a);
        int max2 = arr[n-1];
        int b = 1;
        for(int i=n-1;i>0;i--){
            if(arr[i-1] > max2){
                b ++;
                max2 = arr[i-1];
            }
        }
        System.out.println(b);
    }
}