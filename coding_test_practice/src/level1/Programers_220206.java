package level1;

//프로그래머스 : 코딩테스트 연습 level 1 소수 만들기
//uri : https://programmers.co.kr/learn/courses/30/lessons/12977

public class Programers_220206 {

	 public int solution(int[] nums) {
		 int answer = 0;
	     boolean check = false; // 소수인지 아닌지 판별하기 위한 선언

	     
	      for (int i = 0; i < nums.length; i++) { // 첫 번째 숫자 도출
	         for (int j = i + 1; j < nums.length; j++) { // 두 번째 숫자 도출
	            for (int k = j + 1; k < nums.length; k++) {  // 세 번째 숫자 도출
	               int num = nums[i] + nums[j] + nums[k]; //값 도출
	               
	                 check = sosuCheck(num);  // 소수판별
	                      
	               if (check == true) // true라면 소수 false라면 소수가 아님
	                  answer++; 

	            }
	         }

	      }
	      return answer;
	    }
	 
	 public boolean sosuCheck(int num) {
	      boolean check = true; 
	      
	      for(int i=2; i<num; i++) { // 소수는 1과 자기자신만이 나뉘어지는 숫자를 의미 즉 1과 자기자신을 제외한 사이숫자와 나누어 0이 되면 소수가 아님  
	         if(num%i == 0) {
	            check = false;
	            break;
	         }
	      }
	      return check;
	   }
}
