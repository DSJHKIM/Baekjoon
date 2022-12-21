import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().toUpperCase().split("");
        String[] al = new String[26];
        int[] arr = new int[26];
        for(int i=65;i<=90;i++){
            al[i-65] = String.valueOf((char)i);
            arr[i-65] = 0;
        } 
        for(int i=0;i<str.length;i++){
            for(int j=0;j<26;j++){
                if(String.valueOf(str[i]).equals(al[j])){
                    arr[j]++;
                    break;
                };
            }
        }
        int max = 0;
        String ans = new String();
        for(int i=0;i<26;i++){
            if(arr[i] == max){
                ans = "?";
            }
            else if(arr[i] > max){
                max = arr[i];
                ans = al[i];
            }
        }
        System.out.println(ans);
    }
}