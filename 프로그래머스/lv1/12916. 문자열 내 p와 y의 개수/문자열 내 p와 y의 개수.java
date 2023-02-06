class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        String[] arr = s.split("");
        int pchk = 0;
        int ychk = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Y")){
                ychk++;
            }else if(arr[i].equals("P")){
                pchk++;
            }
        }
        if(pchk != ychk){
            answer = false;
        }

        return answer;
    }
}