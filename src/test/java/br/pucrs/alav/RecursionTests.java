package br.pucrs.alav;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RecursionTests {
	private Recursion rec;
	
	@BeforeAll
	public void setUp() {
		rec = new Recursion();
	}
	
	@Test
	public void testMultNat1() {
		assertEquals(24, rec.multNat(6, 4), "6 * 4 == 24");
	}
	
	@Test
	public void testMultNat2() {
		assertEquals(24, rec.multNat(4, 6), "4 * 6 == 24");
	}
	
	@Test
	public void testMultNat3() {
		assertEquals(05, rec.multNat(1, 5), "1 * 5 == 5");
	}
	
	@Test
	public void testMultNat4() {
		assertEquals(25, rec.multNat(5, 5), "5 * 5 == 25");
	}
	
	@Test
	public void testMultNat5() {
		assertEquals(0, rec.multNat(0, 5), "0 * 5 == 0");
	}
	
	@Test
	public void testMultNat6() {
		assertEquals(0, rec.multNat(5, 0), "0 * 5 == 0");
	}

	@Test
	public void testSomaIncr1() {
		assertEquals(6, rec.somaIncr(4, 2), "4 + 2 == 6");
	}
	
	@Test
	public void testSomaIncr2() {
		assertEquals(6, rec.somaIncr(2, 4), "2 + 4 == 6");
	}

	@Test
	public void testSomaIncr3() {
		assertEquals(8, rec.somaIncr(4, 4), "4 + 4 == 8");
	}

	@Test
	public void testSomaIncrAlt1() {
		assertEquals(6, rec.somaIncrAlt(4, 2), "4 + 2 == 6");
	}
	
	@Test
	public void testSomaIncrAlt2() {
		assertEquals(6, rec.somaIncrAlt(2, 4), "2 + 4 == 6");
	}

	@Test
	public void testSomaIncrAlt3() {
		assertEquals(8, rec.somaIncrAlt(4, 4), "4 + 4 == 8");
	}

	@Test
	public void testSomaSerie1() {
		assertEquals(1.0, rec.somaSerie(1), 0.00001, " para n = 1");
	}
	
	@Test
	public void testSomaSerie2() {
		assertEquals(1.5, rec.somaSerie(2), 0.00001, " para n = 2");
	}

	@Test
	public void testSomaSerie3() {
		assertEquals(1.833333, rec.somaSerie(3), 0.00001, " para n = 3");
	}
	
	@Test
	public void testSomaSerie4() {
		assertEquals(2.083333, rec.somaSerie(4), 0.00001, " para n = 4");
	}
	
	@Test
	public void testSomaSerie5() {
		assertEquals(2.283333, rec.somaSerie(5), 0.00001, " para n = 5");
	}

	@Test
	public void testreverseStr1() {
		assertEquals("asaC", rec.reverseStr("Casa"));
	}
	
	@Test
	public void testreverseStr2() {
		assertEquals("ocinâgrO", rec.reverseStr("Orgânico"));
	}
	
	@Test
	public void testreverseStr3() {
		assertEquals("olelaraP", rec.reverseStr("Paralelo"));
	}	
	
	@Test
	public void testreverseStr4() {
		assertEquals("ararA", rec.reverseStr("Arara"));
	}	
	
	@Test
	public void testreverseStr5() {
		assertEquals("", rec.reverseStr("a"));
	}	
}
