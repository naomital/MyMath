
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import myMath.Polynom;

class PolynomTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Additiontest() {
		Polynom p = new Polynom("5x^2");
		Polynom p1 = new Polynom("3x^2");
		Polynom Actual = new Polynom("8x^2");
		p.add(p1);
		//assertEquals(p , Actual) : "error: addition isn't working!";
		
	}

}
