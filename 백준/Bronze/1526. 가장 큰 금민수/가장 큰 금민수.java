import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num;i>=4;i--){
            String[] arr = Integer.toString(i).split("");
            Boolean bool = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j].equals("4") || arr[j].equals("7")){
                    bool = true;
                }
                else{
                    bool = false;
                    break;
                }
            }
            if(bool == true){
                System.out.println(i);
                break;
            }
        }
    }
}