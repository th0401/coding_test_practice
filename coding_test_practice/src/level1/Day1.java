package level1;

import java.util.Scanner;


class Solution {
	public int solution(int n) {

		// ����n�� �Է¹޾�
		// n�� ����� ��� ���� �� ����
		// 0<=n<=3000
		int answer = 0;
		
		while(true) {
			if(1<=n & n<=3000) {

				for(int i = 1; i <= n; i++) {
					if(n%i==0) {
						answer += i;
					}
				}
				System.out.println("������ ���� "+answer+"�Դϴ�");


			}else if(n == 0) {
				System.out.println("0�� �Է��� �� �����!");
				
			}
			else {
				System.out.println("1~3000 ���̰��� �Է����ּ���");
				

			}

			return answer;
		} 	

	}
}


public class Day1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		
		int answer = 0;
		int num = sc.nextInt();
		
		Solution solution = new Solution();
		
		answer = solution.solution(num);
		
		System.out.println("���� : " + answer);



	}

}
