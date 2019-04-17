package nl.hu.belasting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BerekenBelasting {
	
	private Taxcalculator calculator;
	
	@Test
	public void zeroIncome(){
		calculator= new Taxcalculator();
		
		assertEquals(0,calculator.calculate(0));
	}
	@Test
	public void shouldPayMaxAmountFirstTier(){
		calculator= new Taxcalculator();
		
		assertEquals(7361,calculator.calculate(20142));
	}
	
	@Test
	public void shouldPay5000AmountFirstTier(){
		calculator= new Taxcalculator();
		
		assertEquals(1827,calculator.calculate(5000));
	}
	
	@Test
	public void shouldPayMaxAmountFirstTierwith1000InSecond(){
		calculator= new Taxcalculator();
		
		assertEquals(7769,calculator.calculate(21142));
	}
	
//	@Test
//	public void testdoesDateQualify(){
//		boolean b=aowQualifier.getInkomstenbelasting();
//		assertFalse(b);
//	}
}
