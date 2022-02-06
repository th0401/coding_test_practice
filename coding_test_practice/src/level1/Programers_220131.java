package level1;

import java.util.Scanner;

//프로그래머스 : 코딩테스트 연습 level 1 소수찾기
//uri : https://programmers.co.kr/learn/courses/30/lessons/12921
/*
	문제 설명
	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
	(1은 소수가 아닙니다.)

	제한 조건
	n은 2이상 1000000이하의 자연수입니다.*/

class Solution3 {
	public int solution(int n) {


		// 입력값의 소수들의 갯수
		int answer = 0;
		
		// 숫자의 약수의 갯수
		int measureNum = 0;
		
		// 숫자들은 2 ~ n(입력값)의 크기이다 따라서 2부터 시작해서 n+1미만의 값을 지정한 반복문
		for(int i = 2; i< n+1; i++) {
			
			// 숫자들의 약수의 갯수를 확인하기 위한 반복문
			// 만약 약수가 1과 자기자신뿐이라면(measuer == 2라면) answer에 +1 하여 값을 구함. 
			for(int j = 1; j < i+1; j++) {
				if(i%j==0) {
					measureNum += 1;
					 if(measureNum > 2) {
						 break;
					 }
				}								
			}

			// 반드시 반복문 바깥에 조건문을 달아야한다 그렇지 않으면 모든 수를 체크함.
			if(measureNum == 2) {
				answer += 1;
			}
			//약수 초기화
			measureNum = 0;
		}
		// 놀랍게도 이렇게 하면 코드가 굉장히 비효율적이라는 것을 깨달았다. 그래서 효율성테스트에서 실패하여 다시 구현해보겠다!
		return answer;
	}
}

// 에라토스테네스의 체
class Solution3_1 {
	public int solution(int n) {


		// 입력값의 소수들의 갯수
		int answer = 0;
		
		// 1. 에라토스테네스의 체로 거르기 위한 1차원 배열.
        boolean check[] = new boolean[n+1];
        
        // 2. 2부터 n까지의 수들 중
        for(int i =2;i<=n;i++){
            // 2-1. 소수의 배수로써 걸러진 수들은 넘어가고, (4,6,8,9..... 등)
            if(check[i] == true) continue;
            // 2-2. 자신을 제외한 배수를 고려하기 위해 i+i; j<=n;j=j+i 조건으로 걸러준다.
            for(int j=i + i;j<=n;j+=i){
                check[j] = true;
            }
        }
        
        // 3. 걸러지지 않은 수 들의 개수를 카운팅.
        for(int i=2;i<=n;i++){
            if(!check[i]) {
                answer++;
            }
        }
		return answer;
	}
}



public class Programers_220131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int number = 0;
		
		Solution3 solution = new Solution3();

		while(true) {
			System.out.println("2 이상의 숫자를 입력하세요 : ");
			number = sc.nextInt();
			if(number<2||1000001<number) {
				continue;
			}
			System.out.println("답은 "+solution.solution(number)+"입니다");
			break;
		}
		





	}

}
