import java.util.Iterator;

import edu.uwm.cs351.Coin;
import edu.uwm.cs351.Register;
import junit.framework.TestCase;

public class TestEfficiency extends TestCase {
	Coin.Purse p;
	Register r;
	
	@Override
	public void setUp() {
		p = new Coin.Purse();
		r = new Register();
		try {
			assert 1/p.size() == 42 : "OK";
			assertTrue(true);
		} catch (ArithmeticException ex) {
			System.err.println("Assertions must NOT be enabled to use this test suite.");
			System.err.println("In Eclipse: remove -ea from the VM Arguments box under Run>Run Configurations>Arguments");
			assertFalse("Assertions must NOT be enabled while running efficiency tests.",true);
		}
	}

	private static final int POWER = 20;
	private static final int MAX = 1 << POWER;
	
	Coin c(float f) {
		return new Coin(f);
	}
	
	
	public void testA() {
		for (int i=0; i < MAX; ++i) {
			assertFalse(p.hasNext());
			p.addBefore(c(i));
		}
		assertEquals(MAX, p.size());
	}
	
	public void testB() {
		for (int i=0; i < MAX; ++i) {
			assertEquals(i, p.size());
			p.addAfter(c(i));
		}
		assertEquals(MAX, p.size());
	}
	
	protected void addOddEven(int lo, int hi) {
		for (int i=lo; i < hi; ++i) {
			if ((i&1) == 0) { // even
				p.addBefore(c(i));
			} else {
				p.addAfter(c(i));
			}
		}
	}
	
	
	public void testC() {
		addOddEven(0,MAX);
		assertEquals(MAX, p.size());
	}
	
	public void testD() {
		addOddEven(0,MAX);
		for (int i=MAX-1; i > 0; i -= 2) {
			assertEquals(0.0f, p.next().getValue()-i);
		}
		assertEquals(MAX/2, p.size());
	}
	
	public void testE() {
		addOddEven(0,MAX);
		Iterator<Coin> it = p.iterator();
		for (int i=0; i < MAX; i += 2) {
			assertEquals(0.0f, it.next().getValue()-i);
		}
		assertEquals(MAX/2, p.size());
	}
	
	public void testF() {
		Coin[] a = new Coin[MAX];
		for (int i=1; i < MAX; ++i) {
			a[i] = c(i);
			p.addBefore(a[i]);
		}
		String str = p.toString();
		String start = "[" + a[1];
		String end = a[MAX-1] + "*]";
		assertEquals(start, str.substring(0, start.length()));
		assertEquals(end, str.substring(str.length()-end.length()));
	}
	
	public void testG() {
		for (int i=0; i < MAX; ++i) {
			r.add(c(i));
		}
	}
	
	public void testH() {
		for (int i=0; i < MAX; ++i) {
			r.add(c(100));
		}
	}
	
	public void testI() {
		Coin[] a = new Coin[MAX];
		for (int i=1; i < MAX; ++i) {
			a[i] = c(i);
			r.add(a[i]);
		}
		Coin.Purse p = r.makeChange(MAX);
		p.iterator();
		assertEquals(a[MAX-1], p.next());
		assertEquals(a[1], p.next());
		assertFalse(p.hasNext());
	}
}
