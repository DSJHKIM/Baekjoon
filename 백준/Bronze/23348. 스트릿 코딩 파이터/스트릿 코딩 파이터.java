import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 한손코딩 난이도
        int B = sc.nextInt(); // 노룩코딩 난이도
        int C = sc.nextInt(); // 폰코딩 난이도
        int N = sc.nextInt(); // 참가한 동아리의 수
        int score = 0; // 가장 높은점수를 받은 동아리의 점수

        for(int i=0;i<N;i++){ // 참가한 동아리의 수 N번만큼 반복
            int total = 0;
            for(int j=0;j<3;j++){
                int aScore = sc.nextInt() * A;
                int bScore = sc.nextInt() * B;
                int cScore = sc.nextInt() * C;
                total = total + aScore + bScore + cScore;
                if(score < total){
                    score = total;
                }
            }
        }
        System.out.println(score);

    }
}