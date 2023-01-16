package Lv0.p18;

// 가장 큰 수 찾기
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx;

        return answer;
    }
}