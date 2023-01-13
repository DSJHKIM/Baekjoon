import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] num = Integer.toString(sc.nextInt()).split("");
        Arrays.sort(num, Collections.reverseOrder());
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
}