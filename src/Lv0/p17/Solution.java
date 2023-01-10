package Lv0.p17;

// 문자열 계산하기
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] s =  my_string.split(" ");
        answer += Integer.parseInt(s[0]);
        for (int i = 1; i < s.length; i+=2){
            if (s[i].equals("+")){
                answer += Integer.parseInt(s[i+1]);
            } else if (s[i].equals("-")){
                answer -= Integer.parseInt(s[i+1]);
            }
        }

        return answer;
    }
}
