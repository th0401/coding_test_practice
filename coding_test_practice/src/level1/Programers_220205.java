package level1;

//프로그래머스 : 코딩테스트 연습 level 1 내적 구하기
//uri :   https://programmers.co.kr/learn/courses/30/lessons/70128

public class Programers_220205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        
	        for(int i = 0; i < a.length; i++) {
	        	
	        	answer += a[i]*b[i];
	        }
	        
	        return answer;
	    }

}
