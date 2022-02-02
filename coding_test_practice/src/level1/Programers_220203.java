package level1;

import java.util.Scanner;

	//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 �� ������ ��
	//uri : https://https://programmers.co.kr/learn/courses/30/lessons/12912
	
	class Solution5 {
	    public long solution(int a, int b) {
	        long answer = 0;
	        
	        // b�� ���ڰ� a���� ������� �����ִ� ���ǹ�
	        if(b < a) {
	        	// a���� �����ϱ� ���� �ٸ� ������ �����Ͽ� a���� ����, 
	        	// �̷��� �����ʰ� a=b b=a�ع����� �̹� a�ǰ��� b�̱⿡ b=b�� �Ǿ������ ������ ���� �� ����
	        	int c = a;
	        	 a = b;
	        	 b = c;
	        }
	        
	        for(int i = a; i < b+1; i++) {
	        	answer += i;
	        }
	        	        
	        return answer;
	    }
	}
	// �����������
	class Solution5_2 {

	    public long solution(int a, int b) {
	        return sumAtoB(Math.min(a, b), Math.max(b, a));
	    }
	    
	    // �̷��� ���������� ����� �� ��� ���Ͱ��� for���� �����°ͺ��� �� ����ȭ�� ������ �� �� �ִ�.
	    private long sumAtoB(long a, long b) {
	        return (b - a + 1) * (a + b) / 2;
	    }
	}

public class Programers_220203 {
			
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� a �Է� : ");
	int a = sc.nextInt();
	System.out.println("���� b �Է� : ");
	int b = sc.nextInt();
	
	Solution5 solution = new Solution5();
	
	System.out.println("���� : "+solution.solution(a, b));
}
}
