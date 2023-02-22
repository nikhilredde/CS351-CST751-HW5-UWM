import java.util.NoSuchElementException;
import java.util.function.Supplier;

import edu.uwm.cs.junit.LockedTestCase;
import edu.uwm.cs351.Coin;

public class TestPurse extends LockedTestCase {
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

	private static final int COINS = 10;
	private Coin[] c;
	private String[] cs;
	private Coin.Purse p;
	private Coin.Spy spy = new Coin.Spy();
	
	@Override
	protected void setUp() {
		c = new Coin[COINS];
		cs = new String[COINS];
		for (int i=0; i < COINS; ++i) {
			c[i] = new Coin(i);
			cs[i] = c[i].toString();
		}
		try {
			assert 1/(int)c[0].getValue() == 42 : "Really?";
			System.err.println("Assertions must be enabled to use this test suite.");
			System.err.println("In Eclipse: add -ea in the VM Arguments box under Run>Run Configurations>Arguments");
			assertFalse("Assertions must be enabled to run this test", true);
		} catch (ArithmeticException ex) {
			assertTrue("assertions enabled", true);
		}
		p = new Coin.Purse();
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
		assertEquals(Ts(1724106231), p.toString()); // how does an empty purse print?
		p.addAfter(c[1]); // add after where the cursor is
		// we don't ever have a current element, so we mark
		// the element we are *after* with a star after it.
		// but if at the beginning, we are after nothing, hence no star
		assertEquals(Ts(1359328449), useNames(p.toString())); // useNames uses our names, e.g. "c1" for c[1]
		p.addAfter(c[2]);
		assertEquals(Ts(613958730), useNames(p.toString())); // no spaces!, still at beginning
		p.addBefore(c[3]);
		assertEquals(Ts(1785967075), useNames(p.toString())); // mark coin that cursor is *after*
		p.addBefore(c[4]);
		assertEquals(Ts(1614877467), useNames(p.toString()));
		assertEquals("c2", cx( () -> p.next()));
		// recall that the iterator is *destructive*
		assertEquals(Ts(305828784), useNames(p.toString()));
		assertEquals(Ts(2015133083), cx( () -> p.next()));
		assertEquals(Ts(63740999), useNames(p.toString()));
		assertEquals(Ts(735751598), cx ( () -> p.next()));
	}
	
	public void test00() {
		assertEquals(0, p.size());
	}
	
	public void test01() {
		assertSame(p, p.iterator());
	}
	
	public void test02() {
		assertFalse(p.hasNext());
	}
	
	
	public void test10() {
		p.addBefore(c[0]);
		assertEquals(1, p.size());
	}
	
	public void test11() {
		p.addBefore(c[1]);
		assertSame(p, p.iterator());
	}
	
	public void test12() {
		p.addBefore(c[2]);
		assertFalse(p.hasNext());
	}
	
	public void test13() {
		p.addBefore(c[3]);
		p.iterator();
		assertTrue(p.hasNext());
	}
	
	public void test14() {
		p.addBefore(c[4]);
		assertException(IllegalArgumentException.class, () -> p.addBefore(c[4]));
	}
	
	public void test15() {
		assertException(NullPointerException.class, () -> p.addBefore(null));
	}

	
	public void test20() {
		p.addAfter(c[0]);
		assertEquals(1, p.size());
	}
	
	public void test21() {
		p.addAfter(c[1]);
		assertSame(p, p.iterator());
	}
	
	public void test22() {
		p.addAfter(c[2]);
		assertTrue(p.hasNext());
	}
	
	public void test23() {
		p.addAfter(c[3]);
		p.iterator();
		assertTrue(p.hasNext());
	}
	
	public void test24() {
		p.addBefore(c[4]);
		assertException(IllegalArgumentException.class, () -> p.addAfter(c[4]));
	}
	
	public void test25() {
		p.addAfter(c[5]);
		assertException(IllegalArgumentException.class, () -> p.addBefore(c[5]));
	}
	
	public void test26() {
		p.addAfter(c[6]);
		assertException(IllegalArgumentException.class, () -> p.addAfter(c[6]));
	}
	
	public void test27() {
		spy.connect(c[7], c[8], c[7]);
		assertException(IllegalArgumentException.class, () -> p.addAfter(c[7]));
	}

	public void test28() {
		assertException(NullPointerException.class, () -> p.addAfter(null));
	}

	
	public void test30() {
		p.addBefore(c[3]);
		p.addAfter(c[0]);
		assertEquals(2, p.size());
	}
	
	public void test31() {
		p.addBefore(c[3]);
		p.addAfter(c[1]);
		assertTrue(p.hasNext());
	}
	
	public void test32() {
		p.addBefore(c[3]);
		p.addAfter(c[2]);
		assertSame(p, p.iterator());
	}
	
	public void test33() {
		p.addBefore(c[3]);
		p.addBefore(c[2]);
		assertFalse(p.hasNext());
	}
	
	public void test34() {
		p.addBefore(c[3]);
		p.addBefore(c[4]);
		p.iterator();
		assertTrue(p.hasNext());
	}
	
	public void test35() {
		p.addAfter(c[3]);
		p.addAfter(c[5]);
		assertTrue(p.hasNext());
	}
	
	public void test36() {
		p.addAfter(c[3]);
		p.addBefore(c[6]);
		assertEquals(2, p.size());
	}
	
	public void test37() {
		p.addAfter(c[3]);
		p.addAfter(c[7]);
		p.addAfter(c[0]);
		assertEquals(3, p.size());
	}
	
	
	public void test40() {
		assertEquals("[]", p.toString());
	}
	
	public void test41() {
		p.addAfter(c[1]);
		assertEquals("[c1]", useNames(p.toString()));
	}
	
	public void test42() {
		p.addBefore(c[2]);
		assertEquals("[c2*]", useNames(p.toString()));
	}
	
	public void test43() {
		p.addBefore(c[8]);
		p.addAfter(c[3]);
		assertEquals("[c8*,c3]", useNames(p.toString()));
	}
	
	public void test44() {
		p.addAfter(c[8]);
		p.addBefore(c[4]);
		p.addAfter(c[3]);
		assertEquals("[c4*,c3,c8]", useNames(p.toString()));
	}
	
	public void test45() {
		p.addAfter(c[8]);
		p.addBefore(c[2]);
		p.addBefore(c[4]);
		assertEquals("[c2,c4*,c8]", useNames(p.toString()));
	}
	
	public void test46() {
		p.addBefore(c[8]);
		p.addBefore(c[5]);
		p.addBefore(c[1]);
		assertEquals("[c8,c5,c1*]", useNames(p.toString()));
	}
	
	public void test47() {
		p.addAfter(c[8]);
		p.addAfter(c[6]);
		p.addAfter(c[0]);
		assertEquals("[c0,c6,c8]", useNames(p.toString()));
	}
	
	public void test48() {
		p.addBefore(c[4]);
		p.addAfter(c[8]);
		p.addBefore(c[0]);
		assertEquals("[c4,c0*,c8]", useNames(p.toString()));
	}
	
	public void test49() {
		p.addBefore(c[4]);
		p.addAfter(c[9]);
		p.addAfter(c[0]);
		assertEquals("[c4*,c0,c9]", useNames(p.toString()));
	}
	
	
	public void test50() {
		assertException(NoSuchElementException.class, () -> p.next());
	}
	
	public void test51() {
		p.addBefore(c[1]);
		assertException(NoSuchElementException.class, () -> p.next());		
	}
	
	public void test52() {
		p.addAfter(c[2]);
		assertSame(c[2], p.next());
	}
	
	public void test53() {
		p.addAfter(c[3]);
		p.next();
		assertEquals(0, p.size());
		assertFalse(c[3].inPurse());
	}
	
	public void test54() {
		p.addBefore(c[5]);
		p.addBefore(c[4]);
		assertException(NoSuchElementException.class, () -> p.next());
	}
	
	public void test55() {
		p.addBefore(c[0]);
		p.addAfter(c[5]);
		assertSame(c[5], p.next());
		assertEquals("[c0*]", useNames(p.toString()));
	}
	
	public void test56() {
		p.addAfter(c[5]);
		p.addAfter(c[6]);
		assertSame(c[6], p.next());
		assertEquals("[c5]", useNames(p.toString()));
	}
	
	public void test57() {
		p.addBefore(c[5]);
		p.addAfter(c[7]);
		p.addBefore(c[0]);
		assertSame(c[7], p.next());
		assertEquals("[c5,c0*]", useNames(p.toString()));
	}
	
	public void test58() {
		p.addAfter(c[0]);
		p.addBefore(c[5]);
		p.addBefore(c[8]);
		assertSame(c[0], p.next());
		assertEquals("[c5,c8*]", useNames(p.toString()));
	}
	
	public void test59() {
		p.addAfter(c[0]);
		p.addAfter(c[5]);
		p.addBefore(c[9]);
		assertSame(c[5], p.next());
		assertEquals("[c9*,c0]", useNames(p.toString()));
	}
}
