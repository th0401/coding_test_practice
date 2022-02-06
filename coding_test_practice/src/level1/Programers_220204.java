package level1;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� ���ϱ�
//uri : https://programmers.co.kr/learn/courses/30/lessons/76501

/*
	���� ����
	� �������� �ֽ��ϴ�. �� �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. 
	���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	absolutes�� ���̴� 1 �̻� 1,000 �����Դϴ�.
	absolutes�� ��� ���� ���� 1 �̻� 1,000 �����Դϴ�.
	signs�� ���̴� absolutes�� ���̿� �����ϴ�.
	signs[i] �� ���̸� absolutes[i] �� ���� ������ �������, �׷��� ������ �������� �ǹ��մϴ�.
*/

class Solution6 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		// signs �迭�� 1�� -1�� ������ֱ� ���� �迭����
		int[] pm = new int[signs.length];
				
		// pm �迭 ����
		for(int i = 0; i < signs.length; i++) {
			if(signs[i] == true) {
				pm[i] = 1;
			}else {
				pm[i] = -1;
			}
		}
		
		// absolutes�Լ��� pm�迭�� ������ ���� ���� 
		for(int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i]*pm[i];
		}
		
		
		
		return answer;
	}
}
// �ٸ� ��� Ǯ��
class Solution6_1 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		
		// ���׿����ڷ� ���� �ذ��� ���...
		for(int i = 0; i < absolutes.length; i++) {
			answer += absolutes[i]* (signs[i] ? 1 : -1);
		}
						
		return answer;
	}
}
public class Programers_220204 {

}
