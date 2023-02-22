import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.uwm.cs351.Coin;
import junit.framework.TestCase;


public class TestInvariant extends TestCase {
	// These tests use a spy method called connect
	// which connects coins in the *reverse* direction:
	//     connect(A,B,C)
	// means A.next = null; B.next = A; C.next = B
	
	protected Coin.Spy spy = new Coin.Spy();
    protected int reports;
    
    protected void assertReporting(boolean expected, Supplier<Boolean> test) {
            reports = 0;
            Consumer<String> savedReporter = spy.getReporter();
            try {
                    spy.setReporter((String message) -> {
                            ++reports;
                            if (message == null || message.trim().isEmpty()) {
                                    assertFalse("Uninformative report is not acceptable", true);
                            }
                            if (expected) {
                                    assertFalse("Reported error incorrectly: " + message, true);
                            }
                    });
                    assertEquals(expected, test.get().booleanValue());
                    if (!expected) {
                            assertEquals("Expected exactly one invariant error to be reported", 1, reports);
                    }
                    spy.setReporter(null);
            } finally {
                    spy.setReporter(savedReporter);
            }
    }
    
	Coin.Purse p;
	
	private static final int NUM_COINS = 10;
	
	Coin[] c;
	Coin[] a; // anonymous coins
	
	@Override
	protected void setUp() {
		c = new Coin[NUM_COINS];
		a = new Coin[NUM_COINS];
		for (int i=0; i < NUM_COINS; ++i) {
			c[i] = new Coin(i);
			a[i] = new Coin(10);
		}
	}

	public void testA0() {
		p = spy.newPurse(null, 0, null);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testA1() {
		p = spy.newPurse(null, 1, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testA2() {
		p = spy.newPurse(null, -1, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testA3() {
		p = spy.newPurse(null, 0, c[0]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testA4() {
		p = spy.newPurse(null, 1, c[0]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	// NB: See note about "connect" at the top of this file
	
	public void testB0() {
		spy.connect(c[1], c[1]);
		p = spy.newPurse(c[1], 1, null);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testB1() {
		spy.connect(c[2], c[2]);
		p = spy.newPurse(c[2], 1, c[2]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testB2() {
		spy.connect(c[2], c[2]);
		p = spy.newPurse(c[2], 1, c[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB3() {
		spy.connect(a[2], a[2], a[1]);
		p = spy.newPurse(a[2], 1, a[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB4() {
		spy.connect(c[1], c[1]);
		p = spy.newPurse(c[1], 0, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB5() {
		spy.connect(c[1], c[1]);
		p = spy.newPurse(c[1], 0, c[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB6() {
		spy.connect(c[1], c[1]);
		p = spy.newPurse(c[1], 0, c[2]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB7() {
		spy.connect(c[1], c[1]);
		p = spy.newPurse(c[1], 2, c[2]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB8() {
		p = spy.newPurse(c[1], 1, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testB9() {
		p = spy.newPurse(c[2], 1, c[2]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	public void testC0() {
		spy.connect(c[3], c[4], c[3]);
		p = spy.newPurse(c[3], 2, null);
		assertReporting(true, () -> spy.wellFormed(p));
	}

	public void testC1() {
		spy.connect(c[5], c[4], c[5]);
		p = spy.newPurse(c[5], 2, c[5]);
		assertReporting(true, () -> spy.wellFormed(p));
	}

	public void testC2() {
		spy.connect(c[5], c[6], c[5]);
		p = spy.newPurse(c[5], 2, c[6]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testC3() {
		spy.connect(c[3], c[4], c[3]);
		p = spy.newPurse(c[3], 3, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}

	public void testC4() {
		spy.connect(c[5], c[4], c[5]);
		p = spy.newPurse(c[5], 1, c[5]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testC5() {
		spy.connect(a[5], a[6], a[5], a[4]);
		p = spy.newPurse(a[5], 2, a[4]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testC6() {
		spy.connect(a[7], a[6], a[7], a[4]);
		p = spy.newPurse(a[7], 2, a[6]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testC7() {
		spy.connect(a[7], a[8]);
		p = spy.newPurse(a[8], 2, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testC8() {
		spy.connect(a[7], a[8]);
		p = spy.newPurse(a[8], 2, a[8]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testC9() {
		spy.connect(a[7], a[8]);
		p = spy.newPurse(a[8], 2, a[7]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testD0() {
		spy.connect(a[8], a[8], a[7]);
		p = spy.newPurse(a[7], 2, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testD1() {
		spy.connect(a[8], a[8], a[7]);
		p = spy.newPurse(a[7], 2, a[7]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testD2() {
		spy.connect(a[8], a[8], a[7]);
		p = spy.newPurse(a[7], 2, a[8]);
		assertReporting(false, () -> spy.wellFormed(p));
	}

	public void testD3() {
		spy.connect(a[8], a[8], a[7]);
		p = spy.newPurse(a[7], 1, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testD4() {
		spy.connect(a[8], a[8], a[7]);
		p = spy.newPurse(a[7], 3, a[7]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	public void testE0() {
		spy.connect(c[9], c[7], c[8], c[9]);
		p = spy.newPurse(c[9], 3, null);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testE1() {
		spy.connect(c[9], c[7], c[8], c[9]);
		p = spy.newPurse(c[9], 3, c[8]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testE2() {
		spy.connect(c[9], c[7], c[8], c[9]);
		p = spy.newPurse(c[9], 3, c[7]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testE3() {
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[9]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testE4() {
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[8]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testE5() {
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[7]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testE6() {
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 2, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testE7() {
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testE8() {
		spy.connect(a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testE9() {
		spy.connect(a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 2, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF0() {
		spy.connect(a[7], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF1() {
		spy.connect(a[7], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF2() {
		spy.connect(a[7], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[8]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF3() {
		spy.connect(a[7], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[7]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF4() {
		spy.connect(a[8], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF5() {
		spy.connect(a[8], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF6() {
		spy.connect(a[8], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[8]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testF7() {
		spy.connect(a[9], a[1]);
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}

	public void testF8() {
		spy.connect(a[8], a[1]);
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}

	public void testF9() {
		spy.connect(a[7], a[1]);
		spy.connect(a[9], a[7], a[8], a[9]);
		p = spy.newPurse(a[9], 3, a[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	public void testG0() {
		spy.connect(c[4], c[3], c[2], c[1], c[4]);
		p = spy.newPurse(c[4], 4, null);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testG1() {
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[1]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testG2() {
		spy.connect(c[4], c[3], c[2], c[1], c[4]);
		p = spy.newPurse(c[4], 4, c[2]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testG3() {
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[3]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testG4() {
		spy.connect(c[4], c[3], c[2], c[1], c[4]);
		p = spy.newPurse(c[4], 4, c[4]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testG5() {
		spy.connect(a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testG6() {
		spy.connect(a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[4]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testG7() {
		spy.connect(a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testG8() {
		spy.connect(a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[2]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testG9() {
		spy.connect(a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[3]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH0() {
		spy.connect(a[3], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH1() {
		spy.connect(a[2], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH2() {
		spy.connect(a[1], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH3() {
		spy.connect(a[1], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[1]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH4() {
		spy.connect(a[3], a[9]);
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH5() {
		spy.connect(a[2], a[9]);
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH6() {
		spy.connect(a[1], a[9]);
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH7() {
		spy.connect(a[4], a[9]);
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH8() {
		spy.connect(a[6], a[7], a[8], a[9]);
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testH9() {
		spy.connect(a[9], a[6], a[7], a[8], a[9]);
		spy.connect(a[4], a[3], a[2], a[1], a[4]);
		p = spy.newPurse(a[4], 4, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	public void testI0() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[0]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI1() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[1]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI2() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[2]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI3() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[3]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI4() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[4]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI5() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[5]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI6() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[6]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI7() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[7]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI8() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[8]);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	public void testI9() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(true, () -> spy.wellFormed(p));
	}
	
	
	public void testJ0() {
		spy.connect(a[0], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ1() {
		spy.connect(a[1], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ2() {
		spy.connect(a[2], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ3() {
		spy.connect(a[3], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ4() {
		spy.connect(a[4], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ5() {
		spy.connect(a[5], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ6() {
		spy.connect(a[6], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ7() {
		spy.connect(a[7], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ8() {
		spy.connect(a[8], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testJ9() {
		spy.connect(a[9], a[9]);
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, a[9]);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	public void testK0() {
		spy.connect(a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK1() {
		spy.connect(a[1], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK2() {
		spy.connect(a[2], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK3() {
		spy.connect(a[3], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK4() {
		spy.connect(a[4], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK5() {
		spy.connect(a[5], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK6() {
		spy.connect(a[6], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK7() {
		spy.connect(a[7], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	public void testK8() {
		spy.connect(a[8], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 9, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
	
	
	public void testL0() {
		spy.connect(a[0], a[8], a[7], a[6], a[5], a[4], a[3], a[2], a[1], a[0]);
		p = spy.newPurse(a[0], 10, null);
		assertReporting(false, () -> spy.wellFormed(p));
	}
}
