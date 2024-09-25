class Solution {
    public String solution(int age) {
        String answer = "";
        String ans = "";
        
        String str = String.valueOf(age);
        
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        
        for (int i = 0; i < str.length(); i++) {
            ans += str.charAt(i);
            int num = Integer.parseInt(ans);
            ans = "";
            
            answer += arr[num];
        }
        
        return answer;
    }
}