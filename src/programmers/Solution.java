package programmers;

class Solution {

	public static int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = schedules.length;
		// 10분 추가
		for (int i = 0; i < schedules.length; i++) {
			schedules[i] += 10;
		}
		// 1 -> 5 6
		// 2 -> 4 5
		// 3 -> 3 4
		// 4 -> 2 3
		// 5 -> 1 2
		// 6 -> 0 1
		// 7 -> 0 6
		//

		for (int i = 0; i < timelogs.length; i++) {
			for (int j = 0; j < 7; j++) {

				if (startday == 7) {
					if (j != 0 && j != 6) {
						if (schedules[i] < timelogs[i][j]) {
							answer--;
							break;
						}
					}
				}

				if (startday + j != 6 && startday + j != 7) {
					if (schedules[i] < timelogs[i][j]) {
						System.out.println(startday);
						System.out.println(j);
						System.out.println(timelogs[i][j]);
						answer--;
						break;
					}
				}
			}
		}

		return answer;
	}
}