import java.util.*;
class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr);
        String arr2 = "";
        for(int i=arr.length-1;i>=0;i--){
            arr2 += arr[i];
        }
        long answer = Long.parseLong(arr2);
        return answer;
    }
}