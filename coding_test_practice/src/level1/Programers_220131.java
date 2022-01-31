package level1;

import java.util.ArrayList;
import java.util.Scanner;

//프로그래머스 : 코딩테스트 연습 level 1 소수찾기
//uri : https://programmers.co.kr/learn/courses/30/lessons/12921

class Solution3 {
	public int solution(int n) {


		// 입력값의 소수들의 갯수
		int answer = 0;
		
		// 숫자의 약수의 갯수
		int measureNum = 0;
		ArrayList measure = new ArrayList();
		// 숫자들은 2 ~ n(입력값)의 크기이다 따라서 2부터 시작해서 n+1미만의 값을 지정한 반복문
		for(int i = 2; i< n+1; i++) {
			
			// 숫자들의 약수의 갯수를 확인하기 위한 반복문
			// 만약 약수가 1과 자기자신뿐이라면(measuer == 2라면) answer에 +1 하여 값을 구함. 
			for(int j = 1; j < i+1; j++) {
				if(i%j==0) {
					measureNum += 1;
					 
				}								
			}

			// 반드시 반복문 바깥에 조건문을 달아야한다 그렇지 않으면 모든 수를 체크함.
			if(measureNum == 2) {
				answer += 1;
			}
			//약수 초기화
			measureNum = 0;
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
