import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a! 구하기
        System.out.println(fact(a));
    }
    public static int fact(int n) {
        if(n==0){
            return 1;
        }
        else if(n<=1){
            return n;
        }
        else{
            return fact(n-1)*n;
        }
    }
}