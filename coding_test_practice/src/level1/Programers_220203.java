package level1;

import java.util.Scanner;

	//프로그래머스 : 코딩테스트 연습 level 1 두 정수의 합
	//uri : https://https://programmers.co.kr/learn/courses/30/lessons/12912
	
	class Solution5 {
	    public long solution(int a, int b) {
	        long answer = 0;
	        
	        // b의 숫자가 a보다 작을경우 취해주는 조건문
	        if(b < a) {
	        	// a값을 저장하기 위해 다른 변수를 생성하여 a값을 선언, 
	        	// 이렇게 하지않고 a=b b=a해버리면 이미 a의값은 b이기에 b=b가 되어버리는 오류를 범할 수 있음
	        	int c = a;
	        	 a = b;
	        	 b = c;
	        }
	        
	        for(int i = a; i < b+1; i++) {
	        	answer += i;
	        }
	        	        
	        return answer;
	    }
	}
	// 등차수열방식
	class Solution5_2 {

	    public long solution(int a, int b) {
	        return sumAtoB(Math.min(a, b), Math.max(b, a));
	    }
	    
	    // 이렇게 등차수열의 방식을 할 경우 위와같이 for문을 돌리는것보다 더 최적화된 성능을 낼 수 있다.
	    private long sumAtoB(long a, long b) {
	        return (b - a + 1) * (a + b) / 2;
	    }
	}

public class Programers_220203 {
			
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 a 입력 : ");
	int a = sc.nextInt();
	System.out.println("정수 b 입력 : ");
	int b = sc.nextInt();
	
	Solution5 solution = new Solution5();
	
	System.out.println("답은 : "+solution.solution(a, b));
}
}
