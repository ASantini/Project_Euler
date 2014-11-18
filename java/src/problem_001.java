public class problem_001 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]) - 1;
		System.out.println(summation(n / 3)*3 + summation(n / 5)*5 -
				summation(n / 15)*15);
		
	} //end main
	
	private static int summation(final int n) {
		return (n * (n + 1)) / 2;
	}
} // end problem_001