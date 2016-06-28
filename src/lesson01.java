
/*
 * lesson01 - Arrays
 */

public class lesson01 {

	public static void main(String[] args) {
		System.out.println(solution(42));
	}

	public static int solution(int N) {

		int[] arr = new int[100];
		int chk = 0;
		int tmp = 0;

		int div, rem;

		if(N == 1){
			return 0;
		}
		
		do {
			div = N / 2;
			rem = N % 2;

			arr[chk++] = rem;
			N = div;
		} while (div != 1);
		arr[chk] = div;


		// array sort
		for (int i = 0; i <= chk / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[chk - i];
			arr[chk - i] = tmp;
		}
		
		// longest binary gap searching
		int count = 0;
		int max = 0;

		for (int i = 0; i <= chk; i++) {
			if (arr[i] == 1) {
				if (count != 0) {
					if (max < count) {
						max = count;
					}
					count = 0;
				}
				continue;
			}
			count++;
		}

		return max;
	}
}
