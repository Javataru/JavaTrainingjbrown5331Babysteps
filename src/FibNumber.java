
public class FibNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(50));

	}
	public static long fib(long z) {
		if (z == 0) {
			return 0;
		}
		else if (z == 1) {
			return 1;
			
		}
		return (fib (z - 1) + fib (z - 2));
	}

}
