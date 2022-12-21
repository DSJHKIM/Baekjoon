import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = new String[26];
        int[] arr2 = new int[26];
        for(int i=97;i<=122;i++){
            char ch = (char)i;
            arr[i-97] = String.valueOf(ch);
            arr2[i-97] = -1;
        }
        for(int i=0;i<str.length();i++){
            String a = String.valueOf(str.charAt(i));
            for(int j=0;j<26;j++){
                if(arr[j].equals(a) && arr2[j] == -1){
                    arr2[j] = i;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.println(arr2[i]);
        }
    }
}