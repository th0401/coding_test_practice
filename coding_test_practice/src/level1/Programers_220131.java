package level1;

import java.util.ArrayList;
import java.util.Scanner;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 �Ҽ�ã��
//uri : https://programmers.co.kr/learn/courses/30/lessons/12921

class Solution3 {
	public int solution(int n) {


		// �Է°��� �Ҽ����� ����
		int answer = 0;
		
		// ������ ����� ����
		int measureNum = 0;
		ArrayList measure = new ArrayList();
		// ���ڵ��� 2 ~ n(�Է°�)�� ũ���̴� ���� 2���� �����ؼ� n+1�̸��� ���� ������ �ݺ���
		for(int i = 2; i< n+1; i++) {
			
			// ���ڵ��� ����� ������ Ȯ���ϱ� ���� �ݺ���
			// ���� ����� 1�� �ڱ��ڽŻ��̶��(measuer == 2���) answer�� +1 �Ͽ� ���� ����. 
			for(int j = 1; j < i+1; j++) {
				if(i%j==0) {
					measureNum += 1;
					 
				}								
			}

			// �ݵ�� �ݺ��� �ٱ��� ���ǹ��� �޾ƾ��Ѵ� �׷��� ������ ��� ���� üũ��.
			if(measureNum == 2) {
				answer += 1;
			}
			//��� �ʱ�ȭ
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
			System.out.println("2 �̻��� ���ڸ� �Է��ϼ��� : ");
			number = sc.nextInt();
			if(number<2||1000001<number) {
				continue;
			}
			System.out.println("���� "+solution.solution(number)+"�Դϴ�");
			break;
		}
		





	}

}
