import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] one = sc.next().split("");
        for(int i=0;i<num-1;i++){
            String[] two = sc.next().split("");
            for(int j=0;j<one.length;j++){
                if(!one[j].equals(two[j])){
                    one[j] = "?";
                }
            }
        }
        for(int i=0;i<one.length;i++){
            System.out.print(one[i]);
        }
    }
}