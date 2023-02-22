package edu.uwm.cs351;

/**
 * A simple cash register that uses the coin/purse system.
 * It keeps the coins sorted by decreasing value.
 */
public class Register {
	private Coin.Purse contents = new Coin.Purse();
	
	/**
	 * Add this coin in reverse sorted order to the register.
	 * Larger coins come first (all the better to make change).
	 * @param c coin to add, must not be null or in a purse already
	 */
	public void add(Coin c) {
		// TODO
	}
	
	/**
	 * Make change from this register.
	 * We use the largest coins available that do not go over
	 * the amount desired.  Sometimes the result will come up short.
	 * FOr example if we have two quarters and want to make change 
	 * for ten cents, the returned purse will be empty.
	 * @param amt amount to make change for.  Currency is ignored.
	 * @return purse of coins that make up the amount.
	 * The total may not be enough if we run out of (small) coins.
	 */
	public Coin.Purse makeChange(float amt) {
		if (amt < 0) throw new IllegalArgumentException("Cannot generate negative change");
		Coin.Purse p = new Coin.Purse();
		// TODO
		return p;
	}
	
	@Override // implementation
	public String toString() {
		contents.iterator(); // make cursor invisible
		return contents.toString();
	}
}
