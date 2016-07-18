
// Counting Elements - MaxCounters
// Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.

public class lesson04_4 {

	public static void main(String[] args) {
		int[] q = new int[] { 3, 4, 4, 6, 1, 4, 4 };
		solution(5, q);

	}

	public static int[] solution(int N, int[] A) { // 시간 고려 O

		int[] arr = new int[N];
		int max = 0;
        int min = 0;
        
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				int n = A[i]-1;
				
				// 최소값보다 작은 경우 최소값과 함께 1을 증가
				arr[n] = (arr[n] < min ? min+1 : arr[n]+1 );
				
				if(arr[n] > max ){   // max값 갱신
					max = arr[n];
				}
				
			} else if (A[i] == N + 1) {
			    min = max;   
			}

		} // for__end
		
        // 값이 하나도 안 바뀐곳은 최소값으로 채워넣기
		for (int i = 0; i < N; i++) {
			if (arr[i] < min) {			
				arr[i] = min;
			}
		}
		
		return arr;
	}

	public static int[] solution2(int N, int[] A) { // 시간 고려 X

		int[] arr = new int[N];
		int len = A.length;
		int max = 0;

		for (int i = 0; i < len; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				int n = ++arr[A[i] - 1];
				max = (n > max ? n : max);
			} else if (A[i] == N + 1) {
				for (int j = 0; j < N; j++) {
					arr[j] = max;
				}
			}

		} // for__end

		for (int i : arr) {
			System.out.print(i + " ");
		}

		return arr;
	}

}
