import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            String str = Integer.toString(num);
            String[] arr2 = str.split("");
            int[] arr = Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray();
            int ans = 2;
            if(num>=1000){
                ans +=3;
            }else if(num>=100){
                ans +=2;
            }else if(num>=10){
                ans ++;
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0){
                    ans += 4;
                }else if(arr[i] == 1){
                    ans += 2;
                }else{
                    ans += 3;
                }
            }
            System.out.println(ans);
        }
    }
}