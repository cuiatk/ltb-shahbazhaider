
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labTerminalB;

import org.junit.Test;

/**
 *
 * @author fa16-bse-027
 */
public class CalculateTest1 {
    
    public CalculateTest1() {
        
	@Test
	public void test() {
		Movie m1 = new Movie("AliBaba", 0);
		Movie m2 = new Movie("NeedForSpeed", 1);
		Customer me = new Customer("Saood");
		Customer me2 = new Customer("ahsan");
		Rental r1 = new Rental(m1, 20);
		Rental r2 = new Rental(m2,20);
		
		/**
		 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
		 */
		
			me.addRental(r1);
			me.addRental(r2);
			//fail("Not yet implemented");
			String output1 = "Rental Record for Saood\r\n" + 
					"	AliBaba	29.0\r\n" + 
					"	Speed	60.0";
			if(output1.equals(me.statement()))
			{
				assert true;
			}
		}
    }
}
        
    
