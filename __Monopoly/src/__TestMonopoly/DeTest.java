package __TestMonopoly;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import __Monopoly.De;

class DeTest {
	De de = new De();

	@Test
	void testGetRandomNumberInRange() {
		int nbGenerer = de.getRandomNumberInRange(1,7);
		assertTrue(7>=nbGenerer && nbGenerer>=0, "Nombre invalide" );
		System.out.println(nbGenerer);
	}
	
	@Test
	void testLanceDe() {
		int nbGenerer = de.lanceDe();
		assertTrue(12>=nbGenerer && nbGenerer>=2, "Nombre invalide" );
		System.out.println(nbGenerer);
	}
}
