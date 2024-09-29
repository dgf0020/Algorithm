import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
		int answer = -1;
		int ans = 0;
        
		Arrays.sort(mats);
        
		for (int i = mats.length - 1; i >= 0; i--) {
			for (int j = 0; j <= park.length - mats[i]; j++) {
				for (int k = 0; k <= park[0].length - mats[i]; k++) {
					label_break:
						for (int x = j; x < j + mats[i]; x++) {
							for (int y = k; y < k + mats[i]; y++) {
								if (!park[x][y].equals("-1")) {
                                    ans = 0;
									break label_break;
								}
								else {
									ans++;
								}
								
							}
						}
					if (mats[i] * mats[i] <= ans) {
						answer = mats[i];
                        return answer;
					}
				}
			}
		}
        return answer;
    }
}