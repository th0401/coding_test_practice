package level1;

public class Programers_220202 {

	//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� �� ���ϱ�
	//uri : https://programmers.co.kr/learn/courses/30/lessons/86051
	
	/*
	���� ����
	0���� 9������ ���� �� �Ϻΰ� ����ִ� ���� �迭 numbers�� �Ű������� �־����ϴ�. 
	numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	1 �� numbers�� ���� �� 9
	0 �� numbers�� ��� ���� �� 9
	numbers�� ��� ���Ҵ� ���� �ٸ��ϴ�.
	*/
	
	class Solution4 {
	    public int solution(int[] numbers) {
	        
	    	// 0~9������ ��
	    	int answer = 45;
	        // �Է� �迭������ �� ��
	        int sum = 0;
	        for(int i = 0; i < numbers.length;i++) {
	        	sum += numbers[i];
	        }
	        
	        // ���� ������ �� �� = 0~9������ ���� - �Է� �迭������ �� ��
	        answer = answer - sum;
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
