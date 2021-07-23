package ocidevops.businesslogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BusinessLogicTest {

	@Test
	public void BusinessLogicObjectCreationTest() {
		assertNotNull(new BusinessLogic());
	}
	
	@Test
	public void addAllTest1() {
		BusinessLogic businessLogic = new BusinessLogic();
		assertEquals(6, businessLogic.addAll(1,2,3));
	}
	
	@Test
	public void addAllTest2() {
		BusinessLogic businessLogic = new BusinessLogic();
		assertEquals(10, businessLogic.addAll(4,5,1));
	}
	
	@Test
	public void addAllTest3() {
		BusinessLogic businessLogic = new BusinessLogic();
		assertEquals(6, businessLogic.addAll(3,1,2));
	}
	
}
