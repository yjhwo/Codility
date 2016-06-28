
public class lesson02 {

	public static void main(String[] args) {
		
		int[] arr = {3,8,9,7,6};
		arr = solution(arr,3);
		
	}

	public static int[] solution(int[] A, int K) {
		
		if(A.length == 0){
			return A;
		}
		
		int len = A.length - 1;
		int tmp = 0;
		
		while (K > 0) {
			tmp = A[len]; // last element

			for (int i = len; i > 0; i--) {
				A[i] = A[i - 1];
			}
			A[0] = tmp;

			K--;
		}
		
		return A;

	}
}
