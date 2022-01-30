package level1;

import java.util.Scanner;

//프로그래머스 : 코딩테스트 연습 level 1 숫자 문자열과 영단어
//uri : https://programmers.co.kr/learn/courses/30/lessons/81301


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
