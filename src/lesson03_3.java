
// Time Complexity - PermMissingElem
// Find the missing element in a given permutation.

public class lesson03_3 {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		int len = A.length;
		int res = 0;

		// sumOfA
		for (int i = 0; i < len; i++) {
			res ^= A[i];
		}
		System.out.println("res:"+res);

		// 1 ~ (N+1)
		for (int i = 1; i <= len + 1; i++) {
			System.out.println("i:"+i);
			res ^= i;
		}
		System.out.println("res2:"+res);
		return res;

	}

	// 2. 범위의 합계 - 배열 값의 합계
	public static int solution2(int[] A) {

		int len = A.length;

		int rangeSum = 0;
		int arrSum = 0;

		for (int i = 0; i <= len + 1; i++) {
			rangeSum += i;
		}

		// A
		for (int i = 0; i < len; i++) {
			arrSum += A[i];
		}

		return rangeSum - arrSum;

	}

}
