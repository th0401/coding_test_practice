package level1;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� ���ϱ�
//uri :   https://programmers.co.kr/learn/courses/30/lessons/70128
/*
	���� ����
	���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

	�̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a, b�� ����)

	���ѻ���
	a, b�� ���̴� 1 �̻� 1,000 �����Դϴ�.
	a, b�� ��� ���� -1,000 �̻� 1,000 �����Դϴ�

*/
public class Programers_220205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        
	        for(int i = 0; i < a.length; i++) {
	        	
	        	answer += a[i]*b[i];
	        }
	        
	        return answer;
	    }

}
