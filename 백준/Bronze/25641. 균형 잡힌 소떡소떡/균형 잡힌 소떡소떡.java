import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        String st = sc.next();

        for(int i=0;i<total;i++){
            String st1=st;
            if(i>0){
                st1=st.substring(i);
            }
            String[] sts=st1.split("");
            int s=0;
            int t=0;
            for(int j=0;j<sts.length;j++){
                if(sts[j].equals("s")){
                    s++;
                }else{
                    t++;
                }
            }
            if(s==t){
                System.out.println(st1);
                break;
            }
        }
    }
}