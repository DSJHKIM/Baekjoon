import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            int score = 0;
            int score1 = 1;
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j) == 'O'){
                    if(j!=0 && arr[i].charAt(j-1) == 'O'){
                        score1++;
                    }
                    score = score+score1;
                }else{
                    score1 = 1;
                }
            }
            System.out.println(score);
        }
    }
}