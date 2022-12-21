import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[81];

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                for(int z=1;z<=c;z++){
                    int num = i+j+z;
                    arr[num]++;
                }
            }
        }
        
        int[] arr2 = new int[81];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr2[80]){
                System.out.println(i);
                break;
            }
        }
    }
}