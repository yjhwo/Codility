
//Counting Elements - FrogRiverOne
//Find the earliest time when a frog can jump to the other side of a river.

public class lesson04_1 {

	public static void main(String[] args) {
		int[] arr = {1,3,1,4,2,3,5,4};
		System.out.println(solution(5, arr, 8));

	}

	static int solution(int X, int A[], int N) {
		
		boolean[] chk = new boolean[X+1];
		
		for(int i=0; i<A.length; i++){
			if(!chk[A[i]]){
				chk[A[i]] = true;
				X--;
			}
				
			if(X == 0)
				return i;
			
		}
		
	    return -1;
	}
}
