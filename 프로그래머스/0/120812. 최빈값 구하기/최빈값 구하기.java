class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int arr[] = new int[1000];
        int max = 0;
        
        for (int i : array) {
            arr[i]++;
            if (max < arr[i]) {
                max = arr[i];
                answer = i;
            }
        }
        
        int cnt = 0;
        
        for (int i : arr) {
            if (max == i) {
                cnt++;
            }
            if (cnt >= 2) {
                    return -1;
            }
        }
        
        return answer;
    }
}