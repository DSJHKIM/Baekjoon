import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            int[] num = new int[n];
            for(int x=0;x<n;x++){
                num[x] = sc.nextInt();
            }
            for(int y=0;y<k;y++){
                for(int j=0;j<n;j++){
                    for(int z=0;z<k;z++){
                        if(j==n-1&&z==k-1){
                            System.out.print(num[j]);
                        }
                        else{
                            System.out.print(num[j]+" ");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}