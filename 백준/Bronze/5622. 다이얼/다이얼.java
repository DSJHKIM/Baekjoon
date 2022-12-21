import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("");
        
        char[] arr = new char[26];
        for(int i=0;i<arr.length;i++)
        {    
            arr[i] = (char)(65+i);
        }
        String str = new String(arr);
        String[] al = str.split("");

        int num = 0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<26;j++){
                if(b[i].equals(al[j])){
                    if(al[j].equals("A")||al[j].equals("B")||al[j].equals("C")){
                        num = num+3;
                    }
                    else if(al[j].equals("D")||al[j].equals("E")||al[j].equals("F")){
                        num = num+4;
                    }
                    else if(al[j].equals("G")||al[j].equals("H")||al[j].equals("I")){
                        num = num+5;
                    }
                    else if(al[j].equals("J")||al[j].equals("K")||al[j].equals("L")){
                        num = num+6;
                    }
                    else if(al[j].equals("M")||al[j].equals("N")||al[j].equals("O")){
                        num = num+7;
                    }
                    else if(al[j].equals("P")||al[j].equals("Q")||al[j].equals("R")||al[j].equals("S")){
                        num = num+8;
                    }
                    else if(al[j].equals("T")||al[j].equals("U")||al[j].equals("V")){
                        num = num+9;
                    }
                    else if(al[j].equals("W")||al[j].equals("X")||al[j].equals("Y")||al[j].equals("Z")){
                        num = num+10;
                    }
                }
            }
        }
        System.out.println(num);
    }
}