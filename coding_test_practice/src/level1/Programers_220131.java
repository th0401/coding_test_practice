package level1;

import java.util.Scanner;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 �Ҽ�ã��
//uri : https://programmers.co.kr/learn/courses/30/lessons/12921
/*
	���� ����
	1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

	�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
	(1�� �Ҽ��� �ƴմϴ�.)

	���� ����
	n�� 2�̻� 1000000������ �ڿ����Դϴ�.*/

class Solution3 {
	public int solution(int n) {


		// �Է°��� �Ҽ����� ����
		int answer = 0;
		
		// ������ ����� ����
		int measureNum = 0;
		
		// ���ڵ��� 2 ~ n(�Է°�)�� ũ���̴� ���� 2���� �����ؼ� n+1�̸��� ���� ������ �ݺ���
		for(int i = 2; i< n+1; i++) {
			
			// ���ڵ��� ����� ������ Ȯ���ϱ� ���� �ݺ���
			// ���� ����� 1�� �ڱ��ڽŻ��̶��(measuer == 2���) answer�� +1 �Ͽ� ���� ����. 
			for(int j = 1; j < i+1; j++) {
				if(i%j==0) {
					measureNum += 1;
					 if(measureNum > 2) {
						 break;
					 }
				}								
			}

			// �ݵ�� �ݺ��� �ٱ��� ���ǹ��� �޾ƾ��Ѵ� �׷��� ������ ��� ���� üũ��.
			if(measureNum == 2) {
				answer += 1;
			}
			//��� �ʱ�ȭ
			measureNum = 0;
		}
		// ����Ե� �̷��� �ϸ� �ڵ尡 ������ ��ȿ�����̶�� ���� ���޾Ҵ�. �׷��� ȿ�����׽�Ʈ���� �����Ͽ� �ٽ� �����غ��ڴ�!
		return answer;
	}
}

// �����佺�׳׽��� ü
class Solution3_1 {
	public int solution(int n) {


		// �Է°��� �Ҽ����� ����
		int answer = 0;
		
		// 1. �����佺�׳׽��� ü�� �Ÿ��� ���� 1���� �迭.
        boolean check[] = new boolean[n+1];
        
        // 2. 2���� n������ ���� ��
        for(int i =2;i<=n;i++){
            // 2-1. �Ҽ��� ����ν� �ɷ��� ������ �Ѿ��, (4,6,8,9..... ��)
            if(check[i] == true) continue;
            // 2-2. �ڽ��� ������ ����� ����ϱ� ���� i+i; j<=n;j=j+i �������� �ɷ��ش�.
            for(int j=i + i;j<=n;j+=i){
                check[j] = true;
            }
        }
        
        // 3. �ɷ����� ���� �� ���� ������ ī����.
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
