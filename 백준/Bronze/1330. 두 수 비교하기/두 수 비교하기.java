import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int A = Integer.parseInt(b[0]);
        int B = Integer.parseInt(b[1]);
        scanner.close();
        if(A>B){
            System.out.println(">");
        }
        else if(A<B){
            System.out.println("<");
        }
        else if(A==B){
            System.out.println("==");
        }
    }
}
