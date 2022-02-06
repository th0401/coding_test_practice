package level1;

import java.util.Scanner;

//프로그래머스 : 코딩테스트 연습 level 1 숫자 문자열과 영단어
//uri : https://programmers.co.kr/learn/courses/30/lessons/81301

/*
	문제설명
	네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

	1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 
	solution 함수를 완성해주세요.
		*/

	/*제한사항
	1 ≤ s의 길이 ≤ 50
	s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
	return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.*/

class Solution2 {
	public int solution(String s) {
		
		
		String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		// replace([기존문자],[바꿀문자]); 
		// replace는 바꾸고싶은 기존문자를 바꾸고싶은 문자로 바꾸는 함수이다.	
		
        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);

	}
}

public class Programers_220130 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해보세요!");
		
		String nums = sc.nextLine();
		Solution2 solution2 = new Solution2();
		System.out.println("답은 : "+ solution2.solution(nums));
		
	}
}
