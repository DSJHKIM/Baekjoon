import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int aa = Integer.parseInt(b[0]);
        int bb = Integer.parseInt(b[1]);
        int cc = Integer.parseInt(b[2]);
        scanner.close();
        if(aa == bb && aa==cc){
            System.out.println(10000+aa*1000);
        }

        if(aa==bb && aa!=cc || aa==cc && aa!=bb){
            System.out.println(1000+aa*100);
        }
        else if(bb==cc && bb!=aa){
            System.out.println(1000+bb*100);
        }

        if(aa!=bb && aa!=cc && bb!=cc){
            if(aa>=bb && aa>=cc){
                System.out.println(aa*100);
            }
            if(bb>=aa && bb>=cc){
                System.out.println(bb*100);
            }
            if(cc>=aa && cc>=bb){
                System.out.println(cc*100);
            }
        }

    }
}
