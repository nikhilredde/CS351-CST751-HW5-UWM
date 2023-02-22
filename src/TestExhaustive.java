import edu.uwm.cs351.Coin;

import edu.uwm.cs351.Register;

import junit.framework.TestCase;

public class TestExhaustive extends TestCase {
	private Register r;
	private String sorted;
	private Coin c1, c2, c3, c4, c5, c6;

	@Override // implementation
	protected void setUp() {
		c1 = new Coin(100);
		c2 = new Coin(50);
		c3 = new Coin(25);
		c4 = new Coin(10);
		c5 = new Coin(5);
		c6 = new Coin(1);
		r = new Register();
	}

	public void test1001() {
		r.add(c1);
		sorted = "[" + c1 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test2001() {
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test2002() {
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test3001() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test3002() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test3003() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test3004() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test3005() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test3006() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4001() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4002() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4003() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4004() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4005() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4006() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4007() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4008() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4009() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4010() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4011() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4012() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4013() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4014() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4015() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4016() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4017() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4018() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4019() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4020() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4021() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4022() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4023() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test4024() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5001() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5002() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5003() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5004() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5005() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5006() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5007() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5008() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5009() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5010() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5011() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5012() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5013() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5014() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5015() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5016() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5017() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5018() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5019() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5020() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5021() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5022() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5023() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5024() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5025() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5026() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5027() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5028() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5029() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5030() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5031() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5032() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5033() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5034() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5035() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5036() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5037() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5038() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5039() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5040() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5041() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5042() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5043() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5044() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5045() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5046() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5047() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5048() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5049() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5050() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5051() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5052() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5053() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5054() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5055() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5056() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5057() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5058() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5059() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5060() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5061() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5062() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5063() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5064() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5065() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5066() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5067() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5068() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5069() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5070() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5071() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5072() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5073() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5074() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5075() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5076() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5077() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5078() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5079() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5080() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5081() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5082() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5083() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5084() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5085() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5086() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5087() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5088() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5089() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5090() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5091() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5092() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5093() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5094() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5095() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5096() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5097() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5098() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5099() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5100() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5101() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5102() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5103() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5104() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5105() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5106() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5107() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5108() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5109() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5110() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5111() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5112() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5113() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5114() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5115() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5116() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5117() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5118() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5119() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test5120() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6001() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6002() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6003() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6004() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6005() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6006() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6007() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6008() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6009() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6010() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6011() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6012() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6013() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6014() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6015() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6016() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6017() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6018() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6019() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6020() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6021() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6022() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6023() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6024() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6025() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6026() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6027() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6028() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6029() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6030() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6031() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6032() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6033() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6034() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6035() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6036() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6037() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6038() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6039() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6040() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6041() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6042() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6043() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6044() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6045() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6046() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6047() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6048() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6049() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6050() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6051() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6052() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6053() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6054() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6055() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6056() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6057() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6058() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6059() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6060() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6061() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6062() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6063() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6064() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6065() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6066() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6067() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6068() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6069() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6070() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6071() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6072() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6073() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6074() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6075() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6076() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6077() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6078() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6079() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6080() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6081() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6082() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6083() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6084() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6085() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6086() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6087() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6088() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6089() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6090() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6091() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6092() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6093() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6094() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6095() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6096() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6097() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6098() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6099() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6100() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6101() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6102() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6103() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6104() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6105() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6106() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6107() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6108() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6109() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6110() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6111() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6112() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6113() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6114() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6115() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6116() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6117() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6118() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6119() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6120() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6121() {
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6122() {
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6123() {
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6124() {
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6125() {
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6126() {
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6127() {
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6128() {
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6129() {
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6130() {
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6131() {
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6132() {
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6133() {
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6134() {
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6135() {
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6136() {
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6137() {
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6138() {
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6139() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6140() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6141() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6142() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6143() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6144() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6145() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6146() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6147() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6148() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6149() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6150() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6151() {
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6152() {
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6153() {
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6154() {
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6155() {
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6156() {
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6157() {
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6158() {
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6159() {
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6160() {
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6161() {
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6162() {
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6163() {
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6164() {
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6165() {
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6166() {
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6167() {
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6168() {
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6169() {
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6170() {
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6171() {
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6172() {
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6173() {
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6174() {
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6175() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6176() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6177() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6178() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6179() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6180() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6181() {
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6182() {
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6183() {
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6184() {
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6185() {
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6186() {
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6187() {
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6188() {
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6189() {
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6190() {
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6191() {
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6192() {
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6193() {
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6194() {
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6195() {
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6196() {
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6197() {
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6198() {
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6199() {
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6200() {
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6201() {
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6202() {
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6203() {
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6204() {
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6205() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6206() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6207() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6208() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6209() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6210() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6211() {
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6212() {
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6213() {
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6214() {
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6215() {
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6216() {
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6217() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6218() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6219() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6220() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6221() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6222() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6223() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6224() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6225() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6226() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6227() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6228() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6229() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6230() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6231() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6232() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6233() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6234() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6235() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6236() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6237() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6238() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6239() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6240() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6241() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6242() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6243() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6244() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6245() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6246() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6247() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6248() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6249() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6250() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6251() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6252() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6253() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6254() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6255() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6256() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6257() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6258() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6259() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6260() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6261() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6262() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6263() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6264() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6265() {
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6266() {
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6267() {
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6268() {
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6269() {
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6270() {
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6271() {
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6272() {
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6273() {
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6274() {
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6275() {
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6276() {
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6277() {
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6278() {
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6279() {
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6280() {
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6281() {
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6282() {
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6283() {
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6284() {
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6285() {
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6286() {
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6287() {
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6288() {
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6289() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6290() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6291() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6292() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6293() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6294() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6295() {
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6296() {
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6297() {
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6298() {
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6299() {
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6300() {
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6301() {
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6302() {
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6303() {
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6304() {
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6305() {
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6306() {
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6307() {
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6308() {
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6309() {
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6310() {
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6311() {
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6312() {
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6313() {
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6314() {
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6315() {
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6316() {
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6317() {
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6318() {
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6319() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6320() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6321() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6322() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6323() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6324() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6325() {
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6326() {
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6327() {
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6328() {
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6329() {
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6330() {
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6331() {
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6332() {
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6333() {
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6334() {
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6335() {
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6336() {
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6337() {
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6338() {
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6339() {
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6340() {
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6341() {
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6342() {
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6343() {
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6344() {
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6345() {
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6346() {
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6347() {
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6348() {
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6349() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6350() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6351() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6352() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6353() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6354() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6355() {
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6356() {
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6357() {
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6358() {
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6359() {
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6360() {
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6361() {
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6362() {
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6363() {
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6364() {
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6365() {
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6366() {
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6367() {
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6368() {
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6369() {
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6370() {
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6371() {
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6372() {
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6373() {
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6374() {
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6375() {
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6376() {
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6377() {
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6378() {
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6379() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6380() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6381() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6382() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6383() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6384() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6385() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6386() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6387() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6388() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6389() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6390() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6391() {
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6392() {
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6393() {
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6394() {
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6395() {
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6396() {
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6397() {
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6398() {
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6399() {
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6400() {
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6401() {
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6402() {
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6403() {
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6404() {
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6405() {
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6406() {
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6407() {
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6408() {
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6409() {
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6410() {
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6411() {
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6412() {
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6413() {
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6414() {
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6415() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6416() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6417() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6418() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6419() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6420() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6421() {
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6422() {
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6423() {
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6424() {
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6425() {
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6426() {
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6427() {
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6428() {
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6429() {
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6430() {
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6431() {
		r.add(c6);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6432() {
		r.add(c4);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6433() {
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6434() {
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6435() {
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6436() {
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6437() {
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6438() {
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6439() {
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6440() {
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6441() {
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6442() {
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6443() {
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6444() {
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6445() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6446() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6447() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6448() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6449() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6450() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6451() {
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6452() {
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6453() {
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6454() {
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6455() {
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6456() {
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6457() {
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6458() {
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6459() {
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6460() {
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6461() {
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6462() {
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6463() {
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6464() {
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6465() {
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6466() {
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6467() {
		r.add(c1);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6468() {
		r.add(c4);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6469() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6470() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6471() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6472() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6473() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6474() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6475() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6476() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6477() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6478() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6479() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6480() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6481() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6482() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6483() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6484() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6485() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6486() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6487() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6488() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6489() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6490() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6491() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6492() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6493() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6494() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6495() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6496() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6497() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6498() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6499() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6500() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6501() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6502() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6503() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6504() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6505() {
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6506() {
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6507() {
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6508() {
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6509() {
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6510() {
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6511() {
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6512() {
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6513() {
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6514() {
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6515() {
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6516() {
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6517() {
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6518() {
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6519() {
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6520() {
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6521() {
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6522() {
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6523() {
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6524() {
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6525() {
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6526() {
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6527() {
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6528() {
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6529() {
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6530() {
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6531() {
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6532() {
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6533() {
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6534() {
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6535() {
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6536() {
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6537() {
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6538() {
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6539() {
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6540() {
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6541() {
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6542() {
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6543() {
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6544() {
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6545() {
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6546() {
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6547() {
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6548() {
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6549() {
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6550() {
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6551() {
		r.add(c1);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6552() {
		r.add(c3);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6553() {
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6554() {
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6555() {
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6556() {
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6557() {
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6558() {
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6559() {
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6560() {
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6561() {
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6562() {
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6563() {
		r.add(c1);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6564() {
		r.add(c2);
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6565() {
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6566() {
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6567() {
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6568() {
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6569() {
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6570() {
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6571() {
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6572() {
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6573() {
		r.add(c1);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6574() {
		r.add(c5);
		r.add(c1);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6575() {
		r.add(c6);
		r.add(c1);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6576() {
		r.add(c1);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6577() {
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6578() {
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6579() {
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6580() {
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6581() {
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6582() {
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6583() {
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6584() {
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6585() {
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6586() {
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6587() {
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6588() {
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6589() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6590() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6591() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6592() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6593() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6594() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6595() {
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6596() {
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6597() {
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6598() {
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6599() {
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6600() {
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		r.add(c4);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6601() {
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6602() {
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6603() {
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6604() {
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6605() {
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6606() {
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6607() {
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6608() {
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6609() {
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6610() {
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6611() {
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6612() {
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6613() {
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6614() {
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6615() {
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6616() {
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6617() {
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6618() {
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6619() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6620() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6621() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6622() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6623() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6624() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6625() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6626() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6627() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6628() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6629() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6630() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6631() {
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6632() {
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6633() {
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6634() {
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6635() {
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6636() {
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6637() {
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6638() {
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6639() {
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6640() {
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6641() {
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6642() {
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6643() {
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6644() {
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6645() {
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6646() {
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6647() {
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6648() {
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6649() {
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6650() {
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6651() {
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6652() {
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6653() {
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6654() {
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6655() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6656() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6657() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6658() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6659() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6660() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6661() {
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6662() {
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6663() {
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6664() {
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6665() {
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6666() {
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6667() {
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6668() {
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6669() {
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6670() {
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6671() {
		r.add(c6);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6672() {
		r.add(c3);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6673() {
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6674() {
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6675() {
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6676() {
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6677() {
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6678() {
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6679() {
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6680() {
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6681() {
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6682() {
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6683() {
		r.add(c6);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6684() {
		r.add(c2);
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6685() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6686() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6687() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6688() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6689() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6690() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6691() {
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6692() {
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6693() {
		r.add(c6);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6694() {
		r.add(c5);
		r.add(c6);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6695() {
		r.add(c4);
		r.add(c6);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6696() {
		r.add(c6);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6697() {
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6698() {
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6699() {
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6700() {
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6701() {
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6702() {
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6703() {
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6704() {
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6705() {
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6706() {
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6707() {
		r.add(c4);
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6708() {
		r.add(c3);
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6709() {
		r.add(c3);
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6710() {
		r.add(c5);
		r.add(c3);
		r.add(c2);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6711() {
		r.add(c2);
		r.add(c3);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6712() {
		r.add(c3);
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6713() {
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6714() {
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c4);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6715() {
		r.add(c2);
		r.add(c5);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6716() {
		r.add(c5);
		r.add(c2);
		r.add(c4);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6717() {
		r.add(c4);
		r.add(c2);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6718() {
		r.add(c2);
		r.add(c4);
		r.add(c5);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6719() {
		r.add(c5);
		r.add(c4);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

	public void test6720() {
		r.add(c4);
		r.add(c5);
		r.add(c2);
		r.add(c3);
		r.add(c6);
		r.add(c1);
		sorted = "[" + c1 + ',' + c2 + ',' + c3 + ',' + c4 + ',' + c5 + ',' + c6 + ']';
		assertEquals(sorted, r.toString());
	}

}
