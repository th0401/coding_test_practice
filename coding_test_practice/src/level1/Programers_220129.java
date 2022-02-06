package level1;

import java.util.Scanner;

// 프로그래머스 : 코딩테스트 연습 level 1 약수의합
// uri : https://programmers.co.kr/learn/courses/30/lessons/12928
/*
	문제
	정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

	제한 사항
	n은 0 이상 3000이하인 정수입니다.*/

class Solution1 {
	public int solution(int n) {

		// 정수n을 입력받아
		// n의 약수를 모두 더한 값 리턴
		// 0<=n<=3000
		int answer = 0;

		while(true) {
			if(1<=n & n<=3000) {

				for(int i = 1; i <= n; i++) {
					if(n%i==0) {
						answer += i;
					}
				}
				System.out.println("정수의 합은 "+answer+"입니다");


			}else if(n == 0) {
				System.out.println("0은 입력할 수 없어요!");

			}
			else {
				System.out.println("1~3000 사이값만 입력해주세요");


			}

			return answer;
		} 	

	}
}


public class Programers_220129 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");

		int answer = 0;
		int num = sc.nextInt();

		Solution1 solution = new Solution1();

		answer = solution.solution(num);

		if(answer != 0) { // 0이라면 잘못 입력한 경우임!
			System.out.println("답은 : " + answer);
		}




	}

}
