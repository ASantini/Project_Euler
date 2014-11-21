/*
* The prime factors of 13195 are 5, 7, 13 and 29.
*
* What is the largest prime factor of the number 600851475143 ?
*/

public class problem_003 {
	private  List<Integer> knownPrimes;
	
	public static void main(String[] args) {
		knownPrimes = new ArrayList<Integer>();
		knownPrimes.add(new Integer(2));
		int number = getInteger(args[0]);
		int index = 0;
		int test = knownPrimes.get(index).valueOf();
		boolean continue = true;
		while (number != 0) {
			while(continue) {
				if(number % test == 0) {
					number /= test;
				} else {
					test = getInteger
				}
			}
		}
	
	
	} // end main
	
	private static Integer nextPrime() {
		int test = knownPrimes.get(knownPrimes.size() -1).valueOf() + 1;
		boolean continue = true;
		while(continue){
			ListIterator<Integer> iter = knownPrimes.listIterator(0);
			while(iter.hasNext()){
				int divisor = iter.next().valueOf();
				if(test % divisor == 0) {
					test++;
					break;
				}
			}
			continue = false;
		}
		return new Integer(test);
	}



} // end problem_003