package level1;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� ���ϱ�
//uri : https://programmers.co.kr/learn/courses/30/lessons/76501

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
