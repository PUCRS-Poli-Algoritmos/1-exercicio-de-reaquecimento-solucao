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
		assertEquals(rec.multNat(6, 4), 24, "6 * 4 == 24");
	}
	
	@Test
	public void testMultNat2() {
		assertEquals(rec.multNat(4, 6), 24, "4 * 6 == 24");
	}
	
	@Test
	public void testMultNat3() {
		assertEquals(rec.multNat(1, 5), 05, "1 * 5 == 5");
	}
	
	@Test
	public void testMultNat4() {
		assertEquals(rec.multNat(5, 5), 25, "5 * 5 == 25");
	}
	
	@Test
	public void testMultNat5() {
		assertEquals(rec.multNat(0, 5), 0, "0 * 5 == 0");
	}
	
	@Test
	public void testMultNat6() {
		assertEquals(rec.multNat(5, 0), 0, "0 * 5 == 0");
	}

	@Test
	public void testSomaIncr1() {
		assertEquals(rec.somaIncr(4, 2), 6, "4 + 2 == 6");
	}
	
	@Test
	public void testSomaIncr2() {
		assertEquals(rec.somaIncr(2, 4), 6, "2 + 4 == 6");
	}

	@Test
	public void testSomaIncr3() {
		assertEquals(rec.somaIncr(4, 4), 8, "4 + 4 == 8");
	}

	@Test
	public void testSomaIncrAlt1() {
		assertEquals(rec.somaIncrAlt(4, 2), 6, "4 + 2 == 6");
	}
	
	@Test
	public void testSomaIncrAlt2() {
		assertEquals(rec.somaIncrAlt(2, 4), 6, "2 + 4 == 6");
	}

	@Test
	public void testSomaIncrAlt3() {
		assertEquals(rec.somaIncrAlt(4, 4), 8, "4 + 4 == 8");
	}

	@Test
	public void testSomaSerie1() {
		assertEquals(rec.somaSerie(1), 1.0, " para 1");
	}
	
	@Test
	public void testSomaSerie2() {
		assertEquals(rec.somaSerie(2), 1.5, " para 3");
	}

	@Test
	public void testSomaSerie3() {
		assertEquals(rec.somaSerie(3), 1.83, " para 3");
	}
}
