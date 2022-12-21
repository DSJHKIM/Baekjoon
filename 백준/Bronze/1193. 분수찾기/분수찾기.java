import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int son = 1;
        int sonmax = 1;
        boolean sonplus = true;
        int par = 1;
        int parmax = 2;
        boolean parplus = true;
        for(int i=1;i<=x;i++){
            // 분자
            if(i>1){
                if(son == sonmax){
                    sonplus = false;
                    sonmax = sonmax+2;
                }
                if(sonplus == true){
                    son++;
                }
                else if(son == 1){
                    sonplus = true;
                }
                else{
                    son --;
                }
            }
            // 분모
            if(i>1){
                if(par == parmax){
                    parplus = false;
                    parmax = parmax+2;
                }
                if(parplus == true){
                    par++;
                }
                else if(par == 1){
                    parplus = true;
                }
                else{
                    par --;
                }
            }
        }
    
        System.out.println(son+"/"+par);



        //                                                1                       2
        //                    X : 1   2 3   4 5 6   7 8 9 0   1 2 3 4 5   6 7 8 9 0 1   2 3 4 5 6 7 8
        // 분자[](고점 홀수, +2) : 1 / 1 2   3 2 1 / 1 2 3 4   5 4 3 2 1 / 1 2 3 4 5 6   7 6 5 4 3 2 1
        //                        -   - -   - - -   - - - -   - - - - -   - - - - - -   - - - - - - -
        // 분모[](고점 짝수, +2) : 1   2 1 / 1 2 3   4 3 2 1 / 1 2 3 4 5   6 5 4 3 2 1 / 1 2 3 4 5 6 7 6 5 4 3 2 1

        // 분자[] + "/" + 분모[]
    }
}