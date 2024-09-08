class Solution {
    public String solution(String new_id) {
        String answer = "";
		
		// 1. 대문자를 소문자로 바꾸기
		answer = new_id.toLowerCase();
		
		// 2. 알파벳 소문자, 숫자, -, _, .를 제외한 모든 문자 제거
		answer = answer.replaceAll("[^a-z0-9._-]", "");
		
		// 3. 마침표 .. -> .으로 바꾸기
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		
		// 4. 마침표가 처음이나 끝에 위치한다면 제거
		answer = answer.replaceAll("^[.]", "");
		answer = answer.replaceAll("[.]$", "");
		
		// 5. 결과가 빈 문자열이면 "a"로
		if (answer.equals("")) {
			answer = "a";
		}
		
		// 6. 15자 이하
		if (answer.length() > 15) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", "");
		}
		
		
		// 7. 길이가 2자 이하이면 길이가 3이 될 떼까지 마지막 문자 반복
		if (answer.length() <= 2) {
			while (answer.length() != 3) {
				answer += answer.charAt(answer.length() - 1);
			}
		}
        
        return answer;
    }
}