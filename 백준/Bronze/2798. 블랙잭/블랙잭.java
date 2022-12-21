import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();
        int max = sc.nextInt();
        int[] num = new int[card];
        int ans = 0;
        for(int i=0;i<card;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<card;i++){
            for(int j=i+1;j<card;j++){
                for(int z=j+1;z<card;z++){
                    int sum = num[i]+num[j]+num[z];
                    if(sum <= max && sum>ans){
                        ans = sum;
                    }
                }
            }
        }

        System.out.println(ans);

    }
}