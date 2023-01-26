class Solution {
    public String solution(String s) {
        String answer = new String();
        String[] arr = s.split("");
        if(s.length()%2 == 1){
            answer = arr[s.length()/2];
        }else{
            answer = arr[s.length()/2-1].concat(arr[s.length()/2]);
        }
        return answer;
    }
}