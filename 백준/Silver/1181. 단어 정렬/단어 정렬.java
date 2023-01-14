import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<50;i++){
            for(int j=0;j<num;j++){
                if(arr[j].length() == i+1){
                    if(list.size() > 0){
                        if(!list.get(list.size()-1).equals(arr[j]))
                        list.add(arr[j]);
                    }
                    else if(list.size()==0){
                        list.add(arr[j]);
                    }
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}