package level1;

//프로그래머스 : 코딩테스트 연습 level 1 음양 더하기
//uri : https://programmers.co.kr/learn/courses/30/lessons/76501

class Solution6 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		// signs 배열을 1과 -1로 만들어주기 위한 배열선언
		int[] pm = new int[signs.length];
				
		// pm 배열 구성
		for(int i = 0; i < signs.length; i++) {
			if(signs[i] == true) {
				pm[i] = 1;
			}else {
				pm[i] = -1;
			}
		}
		
		// absolutes함수와 pm배열의 합으로 정답 도출 
		for(int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i]*pm[i];
		}
		
		
		
		return answer;
	}
}
// 다른 사람 풀이
class Solution6_1 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		
		// 삼항연산자로 쉽게 해결한 모습...
		for(int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i]* (signs[i] ? 1 : -1);
		}
						
		return answer;
	}
}
public class Programers_220204 {

}
