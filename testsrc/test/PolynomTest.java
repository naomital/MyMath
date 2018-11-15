
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import myMath.Polynom;
import myMath.Polynom_able;

class PolynomTest {
	@Test
	static void addTest() {
		
		Polynom p1 = new Polynom("6x");
		Polynom p2 = new Polynom("x");
		p1.add(p2);
		Polynom Actual = new Polynom("7x");
		if (p1.toString().equals(Actual.toString())) {
			fail("error: addition isn't working!");
		}
		
//		System.out.print("Expected: x^4-7x^3+2.2x-3.5  ,  ");
//		System.out.print("Actual: ");
//		System.out.println(p1);
//		System.out.println();
//
//		//case +-:
//		//#2
//		p1 = new Polynom("2x^3 + -2.2X - 6");
//		p2 = new Polynom("x^4 + -5X^3 + 3");
//
//		p1.add(p2);
//		System.out.print("Expected: x^4-3x^3-2.2x-3  ,  ");
//		System.out.print("Actual: ");
//		System.out.println(p1);
//		System.out.println();
//
//		//case of Zero Polynomial + regular Polynomial:
//		//#3
//		p1 = new Polynom("2x^3");
//		p2 = new Polynom("0");
//
//		p1.add(p2);
//		System.out.print("Expected: 2x^3 , ");
//		System.out.print("Actual: ");
//		System.out.println(p1);
//		System.out.println();
	}

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
