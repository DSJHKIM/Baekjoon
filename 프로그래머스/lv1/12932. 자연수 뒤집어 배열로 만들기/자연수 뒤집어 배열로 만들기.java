class Solution {
    public int[] solution(long n) {
        String[] arr = Long.toString(n).split("");
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            answer[arr.length-i-1] = Integer.valueOf(arr[i]);
        }
        
        return answer;
    }
}