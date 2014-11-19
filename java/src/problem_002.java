public class problem_002 {

	private static int limit = 4000000;

	public static void main(String[] args) {
		int fib1 = 1;
		int fib2 = 1;
		int fib3 = fib1 + fib2;
		int sum = 0;
		while(fib1 < limit && fib2 < limit) {
			sum += fib3;
			fib1 = fib2 + fib3;
			fib2 = fib3 + fib1;
			fib3 = fib1 + fib2;
		}
		System.out.println(sum);
	} // end_main

} // end problem_02