import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int[] arr1 = new int[8];
        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        int[] arr2 = new int[5];
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                if(arr[i] == arr1[j]){
                    arr2[i] = j+1;
                }
            }
        }
        Arrays.sort(arr2);
        int ans = 0;
        for(int i=0;i<5;i++){
            ans += arr1[arr2[i]-1];
        }
        System.out.println(ans);
        for(int i=0;i<5;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}