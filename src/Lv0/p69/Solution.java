package Lv0.p69;

// 진료 순서 정하기
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++){
            for (int j = 0; j < emergency.length; j++){
                if (emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }

        return answer;
    }
}
// 자신보다 큰 값을 count 하면 순위가 됨.
