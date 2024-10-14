class Solution {
    public String solution(int age) {
        String answer = "";
        
        String ans = String.valueOf(age);
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        
        for (int i = 0; i < ans.length(); i++) {
            int a = Integer.parseInt(String.valueOf(ans.charAt(i)));
            answer += arr[a];
        }
        
        return answer;
    }
}