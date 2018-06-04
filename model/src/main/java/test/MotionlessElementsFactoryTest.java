package test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Element.Permeability;

public class MotionlessElementsFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateBlank() {
		final Blank blank = new Blank();
		assertEquals(Permeability.PENETRABLE, blank.permeability);
	}

	@Test
	public void testCreateCorner() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateKey() {
		fail("Not yet implemented");
	}

}
