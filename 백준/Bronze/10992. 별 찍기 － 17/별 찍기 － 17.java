import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                System.out.print(" ");
            }
            if(i!=num-1){
                System.out.print("* ");
                for(int j=1;j<i;j++){
                    System.out.print("  ");
                }
                if(i!=0){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=0;j<i;j++){
                    System.out.print("**");
                }
            }
            System.out.println();
        }
    }
}