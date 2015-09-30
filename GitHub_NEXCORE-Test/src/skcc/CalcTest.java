package skcc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest extends Calc {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		Calc calc = new Calc();
		assertEquals(3+7, calc.add(3,7));
		
	}


}
