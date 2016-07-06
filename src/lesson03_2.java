
// Time Complexity - TapeEquilibrium
// Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.

// 밑에 오류 잡느라 오래 걸림
// [-1000, 1000] , got 0 expected 2000

public class lesson03_2 {

	public static void main(String[] args) {
		int[] arr = {5,6,2,4,1 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {
    	int head = 0;
    	int tail = 0;
    	int min = 0;
    	
    	for(int n : A){
    		tail += n;
    	}
    	
    	min = Math.abs( head - tail);
    	System.out.println("head:"+head+",tail:"+tail+",min:"+min);
    	
    	for(int i=0; i<A.length; i++){
    		head += A[i];
    		tail -= A[i];    		
    		
    		min =  (Math.abs(head-tail) < min ? Math.abs(head-tail) : min);
    	}
    	        
        return min;
	}
}
