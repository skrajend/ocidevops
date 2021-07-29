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
		assertEquals(3, businessLogic.addAll(1,2));
	}
}
