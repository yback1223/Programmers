package lvl0;
import java.util.*;
import java.io.*;

public class 가채점 {
	static public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
		int num_student = numbers.length;
		String[] answer = new String[num_student];

		for (int i = 0; i < num_student; i++) {
			if (our_score[i] == score_list[numbers[i] - 1]) {
				answer[i] = "Same";
			}
			else {
				answer[i] = "Different";
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] numbers = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
		int[] our_score = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
		int[] score_list = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

		String[] result = solution(numbers, our_score, score_list);
		for (String word : result) {
			bw.write(word + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
