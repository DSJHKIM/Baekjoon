class Solution {
    public int solution(int n) {
        int answer = n;
        String a = Integer.toBinaryString(n);
        int aCnt = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == '1'){
                aCnt++;
            }
        }
        while(true){
            answer++;
            String b = Integer.toBinaryString(answer);
            int bCnt = 0;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i) == '1'){
                    bCnt++;
                }
            }
            if(aCnt == bCnt){
                break;
            }
        }
        return answer;
    }
}