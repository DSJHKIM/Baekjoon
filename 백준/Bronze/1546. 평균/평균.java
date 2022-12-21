import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        double[] arr = new double[total];
        double top = 0;
        double sum = 0;
        double avg = 0;
        for(int i=0;i<total;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<total;i++){
            if(top < arr[i]){
                top = arr[i];
            }
        }
        for(int i=0;i<total;i++){
            arr[i]=arr[i]/top;
            sum = sum + arr[i];
        }

        avg = sum/total;

        System.out.println(avg*100);
        
        

    }
}