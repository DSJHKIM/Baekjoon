import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        Boolean bool = false;
        int left = 0;
        int right = 0;
        for(int i=0;i<arr.length;i++){
            if(bool == false){
                if(arr[i].equals("@")){
                    left ++;
                }
                else if(arr[i].equals("(")){
                    bool = true;
                }
            }else{
                if(arr[i].equals("@")){
                    right ++;
                }
            }
        }
        System.out.println(left + " " + right);
    }
}