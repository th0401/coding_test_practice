package level1;

import java.util.Scanner;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� ���ڿ��� ���ܾ�
//uri : https://programmers.co.kr/learn/courses/30/lessons/81301

/*
	��������
	�׿��� ���ε��� ���ڳ��̸� �ϰ� �ֽ��ϴ�. �׿��� ���ε����� ���ڸ� �ǳ� �� �Ϻ� �ڸ����� ���ܾ�� �ٲ� ī�带 �ǳ��ָ� ���ε��� ���� ���ڸ� ã�� �����Դϴ�.

	������ ������ �Ϻ� �ڸ����� ���ܾ�� �ٲٴ� �����Դϴ�.

	1478 �� "one4seveneight"
	234567 �� "23four5six7"
	10203 �� "1zerotwozero3"
	�̷��� ������ �Ϻ� �ڸ����� ���ܾ�� �ٲ�����ų�, Ȥ�� �ٲ��� �ʰ� �״���� ���ڿ� s�� �Ű������� �־����ϴ�. s�� �ǹ��ϴ� ���� ���ڸ� return �ϵ��� 
	solution �Լ��� �ϼ����ּ���.
		*/

	/*���ѻ���
	1 �� s�� ���� �� 50
	s�� "zero" �Ǵ� "0"���� �����ϴ� ���� �־����� �ʽ��ϴ�.
	return ���� 1 �̻� 2,000,000,000 ������ ������ �Ǵ� �ùٸ� �Է¸� s�� �־����ϴ�.*/

class Solution2 {
	public int solution(String s) {
		
		
		String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		// replace([��������],[�ٲܹ���]); 
		// replace�� �ٲٰ���� �������ڸ� �ٲٰ���� ���ڷ� �ٲٴ� �Լ��̴�.	
		
        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);

	}
}

public class Programers_220130 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��غ�����!");
		
		String nums = sc.nextLine();
		Solution2 solution2 = new Solution2();
		System.out.println("���� : "+ solution2.solution(nums));
		
	}
}
