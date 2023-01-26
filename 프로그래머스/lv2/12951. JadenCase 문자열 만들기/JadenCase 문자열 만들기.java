class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        arr[0] = arr[0].toUpperCase();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1].equals(" ")){
                arr[i] = arr[i].toUpperCase();
            }
        }
        String answer = String.join("", arr);
        return answer;
    }
}