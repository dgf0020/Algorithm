class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
		int answer = health;
		
		// 공격 인덱스
		int att = 0;
		// 연속 성공
		int s = 0;
		
		// 총 몇번을 반복할 것인가 (제일 마지막에 공격하는 시간만큼)
		int a = attacks[attacks.length - 1][0];
		
		for (int i = 1; i <= a; i++) {
			if (i == attacks[att][0]) {
				answer -= attacks[att][1];
				s = 0;
                
				if (answer <= 0) {
                    break;
                }
				att++;
			}
			else {
				answer += bandage[1];
				s++;
				
				if (s == bandage[0]) {
					answer += bandage[2];
					s = 0;
				}
				
				if (answer >= health) {
					answer = health;
				}
			}
		}
        
        if (answer <= 0) {
            answer = -1;
        }

        return answer;
    }
}