package Lv0.p62;

//2차원으로 만들기
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        for (int i = 0; i < num_list.length/ n; i++){
            for (int j = 0; j < n; j++){
                answer[i][j] = num_list[i*n+j];
            }
        }

        return answer;
    }
}
