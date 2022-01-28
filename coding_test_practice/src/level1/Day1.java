package level1;

import java.util.Scanner;


class Solution {
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


public class Day1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		
		int answer = 0;
		int num = sc.nextInt();
		
		Solution solution = new Solution();
		
		answer = solution.solution(num);
		
		System.out.println("답은 : " + answer);



	}

}
