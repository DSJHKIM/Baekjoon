import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] w = new int[total];
        int[] h = new int[total];
        for(int i=0;i<total;i++){
            w[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        for(int i=0;i<total;i++){
            int rank = 1;
            for(int j=0;j<total;j++){
                if(i!=j && w[j]>w[i] && h[j]>h[i]){
                    rank ++;
                }
            }
            System.out.println(rank);
        }
    }
}