class Solution {
    public int solution(int n) {
        long num = n;
        int answer = 0;
        for(int i=0;i<500;i++){
            if(num == 1){
                break;
            }
            answer ++;
            if(num%2 == 0){
               num /= 2; 
            }else{
                num = num * 3 + 1;
            }
            if(i == 499 && num != 1){
                answer = -1;
            }
        }
        return answer;
    }
}