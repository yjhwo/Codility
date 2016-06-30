
public class lesson03 {

	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		// worst-case time complexity is O(N)... 
		// XOR!!!
		int res = 0;
		
		for (int num : A) {
			res ^= num;
		}		
		
		return res;
	}
	
	
	public static int solution2(int[] A) {
		// O(N**2)
		
		int length = A.length;
		boolean[] B = new boolean[length];
		
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				
				if(B[i]){	// true인 경우
					break;
				}
				
				if (A[i] == A[j]) {
					B[i] = true;
					B[j] = true;

					break;
				}
			}
		}

		// false값 찾기
		for (int i = 0; i < length; i++) {
			if (B[i] == false) {
				return A[i];
			}
		}

		return -1;
	}
}
