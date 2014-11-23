/*
* The prime factors of 13195 are 5, 7, 13 and 29.
*
* What is the largest prime factor of the number 600851475143 ?
* https://projecteuler.net/problem=3
*/
import java.util.*;

public class problem_003 {
	
	public static void main(String[] args) {
		KnownPrimes kp = new KnownPrimes();
		long number = Long.parseLong(args[0]);
		int index = 0;
		long test = kp.getNext();
		while (number != 1) {
			if(number % test == 0) {
				number /= test;
			} else {
				test = kp.getNext();
			}
		}
		System.out.println(test);
		
	
	} // end main
	


	private static class KnownPrimes {
	
		private List<Long> knownPrimes; 
		private int index; 
		
		private KnownPrimes() {
			knownPrimes = new ArrayList<Long>();
			knownPrimes.add(new Long(2));
			knownPrimes.add(new Long(3)); // added so that 2 can be added in nextPrime()
			index = 0;
		} // end KnownPrimes const
		
		public long getNext() {
			if(index == knownPrimes.size()) {
				knownPrimes.add(nextPrime());
			}
			return knownPrimes.get(index++).longValue();
		} // end getNext
		
		private Long nextPrime() {
			long test = knownPrimes.get(knownPrimes.size() -1).longValue() + 2;
			long sqrt = (long)Math.sqrt(test);
			ListIterator<Long> iter = knownPrimes.listIterator(1);
			while(iter.hasNext()){
				long denom = iter.next().longValue();
				if(denom > sqrt) {
					break;
				} else if(test % denom == 0) {
					test += 2;
					sqrt = (long)Math.sqrt(test);
					iter = knownPrimes.listIterator(1);
				}
			}
			return new Long(test);
		}
		
	}// end KnownPrimes



} // end problem_003