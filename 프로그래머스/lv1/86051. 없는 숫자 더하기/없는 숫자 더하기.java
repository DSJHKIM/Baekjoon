class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int total = 0;
        for(int i=0;i<10;i++){
            answer += i;
            for(int j=0;j<numbers.length;j++){
                if(numbers[j] == i){
                    total += i;
                }
            }
        }
        answer -= total;
        return answer;
    }
}