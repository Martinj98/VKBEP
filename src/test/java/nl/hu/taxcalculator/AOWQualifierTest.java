package nl.hu.taxcalculator;

import static java.time.LocalDate.of;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AOWQualifierTest {
	
	private AOWQualifier aowQualifier;
	
	@BeforeEach
	public void beforeEach() {
		aowQualifier = new AOWQualifier(of(2017,1,1));
	}
	
	@Test
	public void testdoesDateQualify(){
		boolean b=aowQualifier.doesDateQualify(of(2016,1,1));
		assertFalse(b);
	}
	@Test
	public void testdoesDateQualify2(){
		boolean b=aowQualifier.doesDateQualify(of(1900,1,1));
		assertTrue(b);
	}

}
