import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i=0;i<total;i++){
            String str = sc.next();
            int[] arr = new int[str.length()];
            int total1 = 0;
            for(int j=str.length()-1;j>=0;j--){
                arr[j] = str.charAt(j) - '0';

                if(j%2 == 0){
                    arr[j] = arr[j] * 2;
                    if(arr[j] >= 10){
                        total1 = total1 + (arr[j]%10) + 1;
                    }
                    else{
                        total1 = total1 + arr[j];
                    }
                }
                else{
                    total1 = total1 + arr[j];
                }
            }
            if(total1 % 10 == 0){
                System.out.println("T");
            }
            else{
                System.out.println("F");
            }
        }

    
    }
}