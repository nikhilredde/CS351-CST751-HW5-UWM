import java.util.function.Supplier;

import edu.uwm.cs.junit.LockedTestCase;
import edu.uwm.cs351.Coin;
import edu.uwm.cs351.Register;

public class TestRegister extends LockedTestCase {

	protected void assertException(Class<? extends Throwable> c, Runnable r) {
		try {
			r.run();
			assertFalse("Exception should have been thrown",true);
		} catch (RuntimeException ex) {
			if (!c.isInstance(ex)) {
				ex.printStackTrace();
			}
			assertTrue("should throw exception of " + c + ", not of " + ex.getClass(), c.isInstance(ex));
		}
	}

	private static final int[] VALUES = { 
			0, 1, 1, 1, 1, 
			5, 5, 5, 5, 5,
			10, 10, 10, 10, 10, 
			10, 10, 10, 10, 10, 
			10, 10, 10, 10, 10,
			25, 25, 25, 25, 25,
			50, 50, 50, 50, 50,
			100, 100, 100, 100, 100
	};
	private static final int COINS = VALUES.length;
	private Coin[] c;
	private String[] cs;
	private Register r;
	
	@Override
	protected void setUp() {
		c = new Coin[COINS];
		cs = new String[COINS];
		
		for (int i=0; i < COINS; ++i) {
			c[i] = new Coin(VALUES[i]);
			cs[i] = c[i].toString();
		}
		r = new Register();
	}
	
	/**
	 * Convert the string to use cN for the names.
	 * @param s string to convert, must not be null
	 * @return string using "c2" rather than "Coin@xf25e4ac(null,2.0f)"
	 */
	String useNames(String s) {
		for (int i=0; i < COINS; ++i) {
			s = s.replace(cs[i], "c"+i);
		}
		return s;
	}
	
	String cx(Supplier<?> supp) {
		try {
			return useNames(""+supp.get());
		} catch(RuntimeException ex) {
			return ex.getClass().getSimpleName();
		}
	}

	
	/// locked tests
	
	public void test() {
		// r has nothing in it
		// WHen we print a register, it never has a star
		r.add(c[10]);
		// an array element c[10] is printed as c10
		assertEquals("[c10]", useNames(r.toString()));
		r.add(c[25]);
		// where is it added?  See the Homework description!
		assertEquals(Ts(1738517967), useNames(r.toString()));
		r.add(c[1]);
		assertEquals(Ts(649761489), useNames(r.toString()));
		Coin.Purse p = r.makeChange(28);
		assertFalse(p.hasNext()); // always for a purse returned by makeChange
		assertEquals(Ts(1116096359), useNames(p.toString())); // what is coin before cursor?
		// what is left?
		assertEquals(Ts(1200413005), useNames(r.toString()));
	}
	
	
	// Normal tests
	
	public void testR0() {
		assertEquals("[]", r.toString());
	}
	
	public void testR1() {
		r.add(c[10]);
		assertEquals("[c10]", useNames(r.toString()));
	}
	
	public void testR2() {
		r.add(c[1]);
		r.add(c[10]);
		assertEquals("[c10,c1]", useNames(r.toString()));
	}
	
	public void testR3() {
		r.add(c[25]);
		r.add(c[1]);
		assertEquals("[c25,c1]", useNames(r.toString()));
	}
	
	public void testR4() {
		r.add(c[5]);
		r.add(c[1]);
		r.add(c[10]);
		assertEquals("[c10,c5,c1]", useNames(r.toString()));
	}
	
	public void testR5() {
		r.add(c[5]);
		r.add(c[6]);
		r.add(c[1]);
		r.add(c[25]);
		assertEquals("[c25,c6,c5,c1]", useNames(r.toString()));
	}
	
	public void testR6() {
		r.add(c[31]);
		r.add(c[30]);
		r.add(c[29]);
		r.add(c[32]);
		assertEquals("[c32,c30,c31,c29]", useNames(r.toString()));
	}
	
	// see TestExhaustive for more tests of Register.add
	
	
	public void testS0() {
		assertEquals("[]", "" + r.makeChange(28));
	}
	
	public void testS1() {
		r.add(c[25]);
		assertEquals("[c25*]", useNames(""+r.makeChange(28)));
	}
	
	public void testS2() {
		r.add(c[25]);
		assertEquals("[]", useNames(""+r.makeChange(8)));
		assertEquals("[c25]", useNames(r.toString()));
	}
	
	public void testS3() {
		r.add(c[25]);
		r.add(c[10]);
		assertEquals("[c25*]", useNames(""+r.makeChange(28)));
		assertEquals("[c10]", useNames(r.toString()));
	}
	
	public void testS4() {
		r.add(c[25]);
		r.add(c[1]);
		assertEquals("[c25,c1*]", useNames(""+r.makeChange(28)));
		assertEquals("[]", useNames(r.toString()));
	}

	public void testS5() {
		r.add(c[25]);
		r.add(c[10]);
		r.add(c[5]);
		r.add(c[1]);
		Coin.Purse p1 = r.makeChange(8);
		Coin.Purse p2 = r.makeChange(28);
		assertEquals("[c5,c1*]", useNames(p1.toString()));
		assertEquals("[c25*]", useNames(p2.toString()));
		assertEquals("[c10]", useNames(r.toString()));
	}
	
	public void testS6() {
		r.add(c[25]);
		r.add(c[10]);
		r.add(c[5]);
		r.add(c[1]);
		assertEquals("[c5,c1*]", useNames(""+r.makeChange(8)));
		assertEquals("[c25,c10]", useNames(r.toString()));
	}
	
	public void testS7() {
		r.add(c[25]);
		r.add(c[26]);
		r.add(c[10]);
		r.add(c[11]);
		r.add(c[5]);
		r.add(c[6]);
		r.add(c[1]);
		r.add(c[2]);
		assertEquals("[c26,c2,c1*]", useNames(""+r.makeChange(28)));
		assertEquals("[c25,c11,c10,c6,c5]", useNames(r.toString()));
	}

	public void testS8() {
		r.add(c[3]);
		assertEquals("[]", "" + r.makeChange(0));
	}
	
	public void testS9() {
		r.add(c[12]);
		assertException(IllegalArgumentException.class, () -> r.makeChange(-1));
	}
}
