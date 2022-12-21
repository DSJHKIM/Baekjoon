import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String a = sc.nextLine();
            if(a.equals("EOI")){
                break;
            }
            String[] b = a.toUpperCase().split("");
            boolean nemo = false;
            for(int i=0; i<b.length;i++){
                if(i<b.length-3 && b[i].equals("N") && b[i+1].equals("E") && b[i+2].equals("M") && b[i+3].equals("O")){
                    nemo = true;
                    break;
                }
            }
            if(nemo == true){
                System.out.println("Found");
            }
            else{
                System.out.println("Missing");
            }
        }
    }
}