package level1;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 �Ҽ� �����
//uri : https://programmers.co.kr/learn/courses/30/lessons/12977
/*
	���� ����
	�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, 
	nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

	���ѻ���
	nums�� ����ִ� ������ ������ 3�� �̻� 50�� �����Դϴ�.
	nums�� �� ���Ҵ� 1 �̻� 1,000 ������ �ڿ����̸�, �ߺ��� ���ڰ� ������� �ʽ��ϴ�.
*/

	public class Programers_220206 {

	 public int solution(int[] nums) {
		 int answer = 0;
	     boolean check = false; // �Ҽ����� �ƴ��� �Ǻ��ϱ� ���� ����

	     
	      for (int i = 0; i < nums.length; i++) { // ù ��° ���� ����
	         for (int j = i + 1; j < nums.length; j++) { // �� ��° ���� ����
	            for (int k = j + 1; k < nums.length; k++) {  // �� ��° ���� ����
	               int num = nums[i] + nums[j] + nums[k]; //�� ����
	               
	                 check = sosuCheck(num);  // �Ҽ��Ǻ�
	                      
	               if (check == true) // true��� �Ҽ� false��� �Ҽ��� �ƴ�
	                  answer++; 

	            }
	         }

	      }
	      return answer;
	    }
	 
	 public boolean sosuCheck(int num) {
	      boolean check = true; 
	      
	      for(int i=2; i<num; i++) { // �Ҽ��� 1�� �ڱ��ڽŸ��� ���������� ���ڸ� �ǹ� �� 1�� �ڱ��ڽ��� ������ ���̼��ڿ� ������ 0�� �Ǹ� �Ҽ��� �ƴ�  
	         if(num%i == 0) {
	            check = false;
	            break;
	         }
	      }
	      return check;
	   }
}
