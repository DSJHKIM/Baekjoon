import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            String str = sc.next();
            int left = 0;
            int right = 0;
            int mark = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '('){
                    left ++;
                }else{
                    right ++;
                }
                if(right > left){
                    System.out.println("NO");
                    mark ++;
                    break;
                }
            }
            if(right != left && mark == 0){
                System.out.println("NO");
            }else if(right == left){
                System.out.println("YES");
            }
        }
    }
}