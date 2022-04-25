package com.lm2a.junit.seccionx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColorBagTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ColorBag c = new ColorBag();
				c.add("red");
				c.add("brown");
				c.add("black");
				c.add("white");
				c.add("yellow");
				
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
	void testAdd() {
		ColorBag co = new ColorBag();
		
		
		assertEquals("pink",co,"el color esta en la lista");
		
		
	}
	
	
	

}
