import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n-m+1];
        int sum = 0;
        int min = 0;
        for(int i=0;i<a.length;i++){
            a[i] = 0;
            int count = 0;
            if(i>0){
                m++;
            }
            if(m==2){
                a[i] = m;
            }
            if(m>2){
                for(int j=2;j<m;j++){
                    if(m%j == 0){
                        count ++;
                    }
                }
            }
            if(m>2 && count == 0){
                a[i] = m;
            }
            sum = sum + a[i];
            if(min == 0){
                min = a[i];
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}