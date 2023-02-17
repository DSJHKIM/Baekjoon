class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = 0;
        int max = 0;
        if(n>m){
            min = m;
            max = n;
        }else{
            min = n;
            max = m;
        }
        for(int i=min;i>0;i--){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;
                break;
            }            
        }
        for(int i=1;i<=max;i++){
            if((max*i)%min == 0){
                answer[1] = max*i;
                break;
            }
        }
        return answer;
    }
}