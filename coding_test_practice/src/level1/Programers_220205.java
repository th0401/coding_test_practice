package level1;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� ���ϱ�
//uri :   https://programmers.co.kr/learn/courses/30/lessons/70128

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
