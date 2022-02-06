package level1;

public class Programers_220207 {

	//프로그래머스 : 코딩테스트 연습 level 1 체육복
	//uri : https://programmers.co.kr/learn/courses/30/lessons/42862

	// 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
	// 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
	// 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
	// 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

	// 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
	// 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

	/*	
	제한사항
	전체 학생의 수는 2명 이상 30명 이하입니다.
	체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
	여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 
	남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
	*/
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;        

		// 체육복 결과확인용 배열
		int[] sNum = new int[n];

		// 빌려주기 전 체육복근황 배열
		for(int i = 0; i < n; i++) {

			sNum[i] = 1;

			// 모든 학생의 시작은 1부터이지만 index로 비교해야하기때문에 값-1(lost[j]-1 , reserve[k]-1)을 지정 
			for(int j = 0; j < lost.length; j++) {
				if(lost[j]-1 == i) {
					sNum[i]--;
				}
			}
			for(int k = 0; k < reserve.length; k++) {
				if(reserve[k]-1 == i) {
					sNum[i]++;
				}
			}

		}
		System.out.println("1차 확인");
		for(int v:sNum) {
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println();
		
		// 체육복을 빌려주는 로직
		for(int i = 0; i < sNum.length-1; i++) {
			
			// 앞의 학생이 체육복이 없는데 뒤의 학생이 여분이 있을경우 
			if(sNum[i] == 0 && sNum[i+1] == 2) {

				sNum[i]++;
				sNum[i+1]--;
			
			// 앞의 학생이 체육복이 여분이 있는데 뒤의 학생이 체육복이 없는경우	
			// 0을 제외한 이유는 i-1의 조건식에 i가 0이 된다면 -2이 되기때문에 0을 제외함
			}else if(i!=0 && sNum[i] == 0 && sNum[i-1] == 2) {
				
				sNum[i]++;
				sNum[i-1]--;
			
			// 위의 조건식에서 0의 경우는 제외했기에(i!=0) 0의 경우의 수 조건식 기입
			} else if(i == 0 && sNum[i+1] ==0 && sNum[i] == 2) {
				sNum[i+1]++;
				sNum[i]--;
			}
						
			
			 if(sNum[1] == 0 && sNum[0] == 2) {
				
				
			}
		
		}
		
		// 모두 체육복을 나눠주고 체육복이 있는 합계구하기
		for(int i = 0; i < sNum.length;i++){
			if(0<sNum[i]) {
				answer++;
			}
		}
		System.out.println("2차 확인");
		for(int v:sNum) {
			System.out.print(v+" ");
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		int[] lost = {3,4,6}; 
		int[] reserve = {2,4,7};
		
		
		int answer = solution(n,lost,reserve);

		System.out.println("답 : "+answer);
	}

	


}
