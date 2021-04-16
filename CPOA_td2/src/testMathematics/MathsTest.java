package testMathematics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exception.MathsException;
import interfaces.IMaths;
import mathematics.Maths;

public class MathsTest {

	private IMaths maths;

	@Before
	public void setUp() {

		this.maths = new Maths();
	}

	@Test
	public void testAdditionCasGeneralNombrePositif() {

		Assert.assertEquals(maths.addition(2, 3), 5);
	}
	
	@Test
	public void testAdditionCasGeneralNombreNegatif() {

		Assert.assertEquals(maths.addition(-2, -3), -5);
		
	}
	
	@Test
	public void testAdditionCasGeneralNégatifPositif() {

		Assert.assertEquals(maths.addition(-2, 3), 1);
		
	}
	
	@Test
	public void testAdditionCasGeneralNombre0() {

		Assert.assertEquals(maths.addition(0, 0), 0);
		
	}
	
	@Test
	public void testSoustractionCasGeneralNombrePositif() {

		Assert.assertEquals(maths.soustraction(6, 3), 3);
	}
	
	@Test
	public void testSoustractionCasGeneralNombreNegatif() {

		Assert.assertEquals(maths.soustraction(-2, -3), 1);
		
	}
	
	@Test
	public void testSoustractionCasGeneralNegatifPositif() {

		Assert.assertEquals(maths.soustraction(-2, 3), -5);
		
	}
	
	@Test
	public void testSoustractionCasGeneralNombre0() {

		Assert.assertEquals(maths.soustraction(0, 0), 0);
		
	}
		
		
	@Test
	public void testMultiplicationCasGeneralNombrePositif(){

		Assert.assertEquals(maths.multiplication(2, 3), 6);
		}
	
	@Test
	public void testMultiplicationCasGeneralNombreNegatif(){

		Assert.assertEquals(maths.multiplication(-2, -3), 6);
		}
	
	@Test
	public void testMultiplicationCasGeneralNombreNegatifPositif(){

		Assert.assertEquals(maths.multiplication(-2, 3), -6);
		}
	
	@Test
	public void testMultiplicationCasGeneralZero(){

		Assert.assertEquals(maths.multiplication(-2, 0), 0);
		}
	
	@Test
	public void testMultiplicationCasGeneralUn(){

		Assert.assertEquals(maths.multiplication(-2, 1), -2);
		}

	@Test
	public void testDivisionCasGeneralNombrePositif() throws MathsException{

		Assert.assertEquals(maths.division(6, 3), 2, 2);
		}
	
	@Test
	public void testDivisionCasGeneralNombreNegatif() throws MathsException{

		Assert.assertEquals(maths.division(-6, -3), 2, 2);
		}
	
	@Test
	public void testDivisionCasGeneralNombreNegatifPositif() throws MathsException{

		Assert.assertEquals(maths.division(6, -3), -2, 2);
		}
	
	@Test(expected = MathsException.class)
	public void testDivisionParZero() throws MathsException{
		
		try {
			maths.division(4, 0);
			
			
		}catch (MathsException e ) {
			Assert.assertEquals(e.getMessage(), "Division par zero impossible");
			throw e;
		}
		
	}
	
}
		
	



