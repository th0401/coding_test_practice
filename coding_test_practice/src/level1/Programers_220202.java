package level1;

public class Programers_220202 {

	//프로그래머스 : 코딩테스트 연습 level 1 없는 수 더하기
	//uri : https://programmers.co.kr/learn/courses/30/lessons/86051
	
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
