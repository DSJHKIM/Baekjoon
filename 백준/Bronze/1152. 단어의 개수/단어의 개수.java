import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split("");
        int num = 0;
        for(int i=0;i<b.length;i++){
            if(i==0){
                num = 0;
            }
            else if(b[i].equals(" ")){
                num ++;
            }
            if(i==b.length-1 && b[i].equals(" ")){
                num --;
            }
        }
        System.out.println(num+1);
    }
}