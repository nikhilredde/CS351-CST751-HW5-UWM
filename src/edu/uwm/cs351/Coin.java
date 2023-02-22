package edu.uwm.cs351;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * A representation of a Coin that has identity.
 * It can be the data of the endogenous class {@link Coin.Purse}.
 */
public class Coin {
	private static Consumer<String> reporter = (s) -> System.out.println("Invariant error: "+ s);
	
	/**
	 * Used to report an error found when checking the invariant.
	 * By providing a string, this will help debugging the class if the invariant should fail.
	 * @param error string to print to report the exact error found
	 * @return false always
	 */
	private static boolean report(String error) {
		reporter.accept(error);
		return false;
	}

	private final Currency currency;
	private final float value;
	
	private Coin next;
	
	/**
	 * Construct a test coin (no currency) of the given value
	 * @param v face value
	 */
	public Coin(float v) {
		this(null,v);
	}
	
	/**
	 * Mint a coin for the given currency and value.
	 * @param c currency, if null, this is a test coin
	 * @param v value of the coin
	 */
	Coin(Currency c, float v) {
		currency = c;
		value = v;
	}
	
	@Override // implementation
	public String toString() {
		return super.toString() + "(" + currency + "," + value + "f)";
	}
	
	/**
	 * Return the currency associated with the coin.
	 * @return currency
	 */
	public Currency getCurrency() {
		return currency;
	}
	
	/**
	 * Return the stated value of the coin.
	 * @return value
	 */
	public float getValue() {
		return value;
	}
	
	/**
	 * Return true if this coin is in a purse.
	 * Such a coin cannot be added to another purse.
	 * @return whether in a purse
	 */
	public boolean inPurse() {
		return next != null;
	}
	
	/**
	 * A container of coins.
	 * This class is an endogenous container, in that every Coin
	 * can be in at most one purse.
	 * A cursor is provided which permits destructive iteration:
	 * every coin is removed as it is returned.
	 */
	public static class Purse // TODO: implements what ?
	{
		// TODO: Data Structure
		
		// TODO: wellFormed
		
		private Purse(boolean b) { } // do not change
		
		/** Create an empty purse */
		public Purse() {
			// TODO
		}
		
		// TODO: Methods of the class
	}
	
	/**
	 * Class for internal testing.
	 * Do not use in client/application code.
	 * Do not change anything in this class.
	 */
	public static class Spy {
		/**
		 * Return the sink for invariant error messages
		 * @return current reporter
		 */
		public Consumer<String> getReporter() {
			return reporter;
		}

		/**
		 * Change the sink for invariant error messages.
		 * @param r where to send invariant error messages.
		 */
		public void setReporter(Consumer<String> r) {
			reporter = r;
		}

		/**
		 * Connect the coins in <em>reverse</em> order.
		 * @param coins coins to connect, must not be null
		 */
		public void connect(Coin... coins) {
			Coin last = null;
			for (Coin c : coins) {
				c.next = last;
				last = c;
			}
		}
		
		/**
		 * Create a new purse with the given data structure
		 * so that we can check whether the data structure is
		 * correctly checked 
		 * @param l last node
		 * @param c count of nodes
		 * @param p precursor
		 * @return un-checked purse
		 */
		public Purse newPurse(Coin l, int c, Coin p) {
			Purse result = new Purse(false);
			result.last = l;
			result.count = c;
			result.precursor = p;
			return result;
		}
		
		/**
		 * Return whether the code says the invariant is true
		 * @param p purse to check
		 * @return whether it checks out
		 */
		public boolean wellFormed(Purse p) {
			return p.wellFormed();
		}
	}
}
