package level1;

public class Programers_220202 {

	//프로그래머스 : 코딩테스트 연습 level 1 없는 수 더하기
	//uri : https://programmers.co.kr/learn/courses/30/lessons/86051
	
	/*
	문제 설명
	0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

	제한사항
	1 ≤ numbers의 길이 ≤ 9
	0 ≤ numbers의 모든 원소 ≤ 9
	numbers의 모든 원소는 서로 다릅니다.
	*/
	
	class Solution4 {
	    public int solution(int[] numbers) {
	        
	    	// 0~9까지의 합
	    	int answer = 45;
	        // 입력 배열값들의 총 합
	        int sum = 0;
	        for(int i = 0; i < numbers.length;i++) {
	        	sum += numbers[i];
	        }
	        
	        // 남은 값들의 총 합 = 0~9까지의 총합 - 입력 배열값들의 총 합
	        answer = answer - sum;
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
