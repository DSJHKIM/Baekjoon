import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt(); // 횟수
            int[] HU = new int[N]; // 휴대폰 사용 종류
            int A = 2; // 에어팟 소모량
            int SUM = 2; // 누적 소모량5
            
            for(int i=0; i<N; i++) { // 휴대폰 사용 종류 입력
                    HU[i] = sc.nextInt();
            }
            
            for(int i=0; i<N-1; i++) { // 전체 횟수만큼 반복
                if(HU[i] != HU[i+1]) { // 다음 수가 다르면 그냥 2% 증가
                    A = 2;
                    SUM = A + SUM;
                    if(SUM >=100){
                        SUM = 0;
                        A = 1;
                    }
                }
                else if(HU[i] == HU[i+1]) { // 다음 수가 같으면 누적 소모량 이전 소모량에 2배씩 증가
                    SUM = (A*2) + SUM;
                    A *= 2;
                    if(SUM >= 100) { // 초기화
                            SUM = 0;
                            A = 1;
                    }
                }
            }
           
            System.out.println(SUM);
            
        sc.close();
    }
}