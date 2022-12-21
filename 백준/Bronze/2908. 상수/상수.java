import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] aa = a.split("");
        String b = sc.next();
        String[] bb = b.split("");
        int aaa = 0;
        int bbb = 0;
        for(int i = 0;i<3;i++){
            if(i==0){
                aaa = aaa+Integer.parseInt(aa[i]);
                bbb = bbb+Integer.parseInt(bb[i]);
            }
            else if(i==1){
                aaa = aaa+Integer.parseInt(aa[i])*10;
                bbb = bbb+Integer.parseInt(bb[i])*10;
            }
            else{
                aaa = aaa+Integer.parseInt(aa[i])*100;
                bbb = bbb+Integer.parseInt(bb[i])*100;
            }
        }
        if(aaa > bbb){
            System.out.println(aaa);
        }
        else{
            System.out.println(bbb);
        }
    }
}