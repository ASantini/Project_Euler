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
			index = 0;
		} // end KnownPrimes const
		
		public long getNext() {
			if(index == knownPrimes.size()) {
				knownPrimes.add(nextPrime());
			}
			return knownPrimes.get(index++).longValue();
		} // end getNext
		
		private Long nextPrime() {
			long test = knownPrimes.get(knownPrimes.size() -1).longValue() + 1;
			boolean cont = true;
			while(cont){
				ListIterator<Long> iter = knownPrimes.listIterator(0);
				while(iter.hasNext()){
					long denom = iter.next().longValue();
					if(test % denom == 0) {
						test++;
						break;
					}
				}
				cont = false;
			}
			return new Long(test);
		}
		
	}// end KnownPrimes



} // end problem_003