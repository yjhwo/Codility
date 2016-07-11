
//Counting Elements -PermCheck
//Check whether array A is a permutation.

public class lesson04_2 {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3 };
		System.out.println(solution(arr));

	}

	static int solution(int[] A){
		boolean[] chk = new boolean[A.length + 1];

		for (int i = 0; i < A.length; i++) {
			if(A[i] > A.length)
				return 0;
			
			chk[A[i]] = true;
		}

		for (int j=1; j<chk.length; j++) {
			if (!chk[j])
				return 0;
			
		}

		return 1;

	}

}
