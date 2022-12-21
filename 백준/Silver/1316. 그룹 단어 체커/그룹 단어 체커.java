import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int total = 0;
        for(int i=0;i<len;i++){
            String str = sc.next();
            StringBuffer strB = new StringBuffer(str);
            int chk = 0;
            if(str.length() == 1){
                total ++;
            }
            else{
                for(int k=0;k<strB.length()-1;k++){
                    if(strB.charAt(k)== strB.charAt(k+1)){
                        strB.deleteCharAt(k);
                        k--;
                    }
                    if(strB.length()==k){
                        break;
                    }
                }
                if(strB.length() == 1){
                    total++;
                }else{
                    for(int x=0;x<strB.length()-1;x++){
                        for(int y=x+1;y<strB.length();y++){
                            if(strB.charAt(x)==strB.charAt(y)){
                                chk = 1;
                                break;
                            }
                        }
                    }
                    if(chk==0){
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}