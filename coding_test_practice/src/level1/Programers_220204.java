package level1;

//프로그래머스 : 코딩테스트 연습 level 1 음양 더하기
//uri : https://programmers.co.kr/learn/courses/30/lessons/76501

/*
	문제 설명
	어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
	실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

	제한사항
	absolutes의 길이는 1 이상 1,000 이하입니다.
	absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
	signs의 길이는 absolutes의 길이와 같습니다.
	signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
*/

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
