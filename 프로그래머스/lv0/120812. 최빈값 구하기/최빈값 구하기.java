class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Boolean bool = false;
        int[] arr = new int[1001];
        int max = 0;
        for(int i=0;i<array.length;i++){
            arr[array[i]] ++;
            if(arr[array[i]] > answer){
                answer = arr[array[i]];
                max = array[i];
                bool = false;
            }
            else if(arr[array[i]] == answer){
                bool = true;
            }
        }
        if(bool == true){
            answer = -1;
        }else{
            answer = max;
        }
        return answer;
    }
}