package level1;

import java.util.Scanner;

//���α׷��ӽ� : �ڵ��׽�Ʈ ���� level 1 ���� ���ڿ��� ���ܾ�
//uri : https://programmers.co.kr/learn/courses/30/lessons/81301


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
