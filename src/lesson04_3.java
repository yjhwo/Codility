import java.util.Arrays;

// Counting Elements -MissingInteger
// Find the minimal positive integer not occurring in a given sequence.

public class lesson04_3 {

	public static void main(String[] args) {
		int[] arr = {4,5,6,2};
		System.out.println(solution2(arr));
	}

	public static int solution2(int[] A) {	// 2nd,3rd,4th
		
		
		Arrays.sort(A);
		int min = 1;
		for (int i : A) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<A.length; i++){
			if(A[i] == min){
				min++;
			}
		}
		
		if(min == 0 || A[A.length-1] <0){	// array 값이 음수인 경우 또는 배열의 최대값이 음수인 경우 최소양수는 무조건 1
			return 1;			
		}

		return min;
	}
	
	
	public static int solution(int[] A) {	// 1st

		boolean chk = true;
		int min = A[0];

		// 배열 A의 최솟값
		for (int i = 0; i < A.length; i++) {
			if (A[i] < min)
				min = A[i];
		}

		System.out.println("min:" + min);

		// 최솟값보다 큰 값 +1,+2...찾아보기

		for (int j = 1; j < A.length; j++) {
			chk = true;
			for (int i = 0; i < A.length; i++) {
				if (min + j == A[i]) {
					chk = false;
					break;
				}
			}
			if (chk) {
				return min + j;
			}
		}

		return -1;
	}

}
