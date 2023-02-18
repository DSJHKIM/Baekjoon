class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Boolean bool = false;
        arr[0] = arr[0].toUpperCase();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1].equals(" ")){
                bool = true;
            }
            if(bool == true){
                arr[i] = arr[i].toUpperCase();
                bool = false;
            }else{
                arr[i] = arr[i].toLowerCase();
                bool = true;
            }
        }
        for(int i=0;i<arr.length;i++){
            answer += arr[i];
        }
        return answer;
    }
}