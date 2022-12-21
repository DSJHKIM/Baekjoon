import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.next();
        String[] sArr = s.split("");
        String[] tArr = {"!","@","#","$","%","^","&","*","(",")","-","+"};
        String[] AArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] aArr = new String[26];
        for(int i=0;i<26;i++){
            aArr[i] = AArr[i].toLowerCase();
        }

        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        for(int i=0;i<len;i++){
            for(int j=0;j<tArr.length;j++){
                if(sArr[i].equals(tArr[j])){
                    a=true;
                    break;
                }
            }
            for(int x=0;x<26;x++){
                if(sArr[i].equals(AArr[x])){
                    b=true;
                    break;
                }
            }
            for(int y=0;y<26;y++){
                if(sArr[i].equals(aArr[y])){
                    c=true;
                    break;
                }
            }
            for(int z=0;z<10;z++){
                if(sArr[i].equals(Integer.toString(z))){
                    d=true;
                    break;
                }
            }
        }

        int cnt = 0;
        if(a==true){
            cnt++;
        }
        if(b==true){
            cnt++;
        }
        if(c==true){
            cnt++;
        }
        if(d==true){
            cnt++;
        }
        
        if(len == 1){
            System.out.println(5);
        }
        else if(len==2){
            System.out.println(4);
        }
        else if(len==3 && (4-cnt)<3){
            System.out.println(3);
        }
        else if(len==4 && (4-cnt)<2){
            System.out.println(2);
        }
        else if(len==5 && (4-cnt)==0){
            System.out.println(1);
        }
        else{
            System.out.println(4-cnt);
        }
    }
}