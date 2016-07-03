
// Time Complexity - FrogJmp

public class lesson03_1 {

	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}

	public static int solution(int X, int Y, int D) {

		int pos = Y - X; // position
		int jmp = 0; // minimal number of jumps

		// if no jump needed
		if (X >= Y) {
			return 0;
		}

		jmp = (pos % D == 0 ? pos / D : pos / D + 1); 		// conditional operator
															
		return jmp;
	}
}
