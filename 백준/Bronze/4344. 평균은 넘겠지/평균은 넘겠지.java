import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i=0;i<total;i++){
            int[] len = new int[total];
            int total2=0;
            len[i] = sc.nextInt();
            int[][] student = new int[total][len[i]];
            for(int j=0;j<len[i];j++){
                student[i][j] = sc.nextInt();
                total2 += student[i][j];
            }
            float avg = total2 / len[i];
            int count = 0;
            for(int k=0;k<len[i];k++){
                if(student[i][k] > avg){
                    count++;
                }
            } 
            float answer = ((float)count/(float)len[i])*100;
            System.out.println(String.format("%.3f",answer)+"%");
        }
    }
}