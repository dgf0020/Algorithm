class Solution {
    public int solution(String s) {
        int answer = 0;
		
		String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for (int i = 0; i < arr.length; i++) {
			String ss = String.valueOf(i);
			s = s.replaceAll(arr[i], ss);
		}
		answer = Integer.parseInt(s);
        
        return answer;
    }
}