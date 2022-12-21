import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            int num = sc.nextInt();
            arr[i] = num%42;
        }
        Set<Integer> set = new HashSet<>();
        for(int loop :arr){
            set.add(loop);
        }
        System.out.println(set.size());
    }
}