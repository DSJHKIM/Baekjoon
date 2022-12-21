import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        String[] arr = a.split("");
        int minus = 0;
        int cc = 0;
        int c = 0;
        int[] dz = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(i+2 < arr.length){
                if(arr[i].equals("d") && arr[i+1].equals("z") && arr[i+2].equals("=")){
                    minus = minus+2;
                    c++;
                    dz[i] = 1;
                }
            }
            if(i+1 < arr.length){
                if(arr[i].equals("c") && arr[i+1].equals("=")){
                    minus++;
                    c++;
                }
                else if(arr[i].equals("c") && arr[i+1].equals("-")){
                    minus++;
                    c++;
                }
                else if(arr[i].equals("d") && arr[i+1].equals("-")){
                    minus++;
                    c++;
                }
                else if(arr[i].equals("l") && arr[i+1].equals("j")){
                    minus++;
                }
                else if(arr[i].equals("n") && arr[i+1].equals("j")){
                    minus++;
                }
                else if(arr[i].equals("s") && arr[i+1].equals("=")){
                    minus++;
                    c++;
                }
                else if(arr[i].equals("z") && arr[i+1].equals("=")){
                    if(i>0 && dz[i-1] == 0){
                        minus++;
                        c++;
                    }    
                }
            }
            if(arr[i].equals("-") || arr[i].equals("=")){
                cc++;
            }
        }
        int totalc = cc - c;
        System.out.println(arr.length-minus-totalc);
    }
}