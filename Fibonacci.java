
public class Fibonacci {
	
	public static int nthTerm(int n) {
		
		if (n == 0) {
			
			return 0;
		}else if (n==1){
			
			return 1;
		}else {
			
			return nthTerm(n-1) + nthTerm(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int result = nthTerm(n);
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");

	}

}
