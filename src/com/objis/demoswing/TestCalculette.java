package com.objis.demoswing;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@DisplayName("Tests Calculatrice")
class TestCalculette {

	@Test
	@Tag("Fonctionne")
	@DisplayName("Addition")
	void testAddition() {
		boolean assume=true;
		assumeTrue(assume);
		assertEquals(5,FenetreCalculette.Addition(5,0));
	}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Addition erreur")
	void testAdditionErreur() {
		assertEquals(5,FenetreCalculette.Addition(5,1));
	}
	
	@Test
	@Tag("Fonctionne")
	@DisplayName("Soustraction")
	void testSoustraction() {
		assertEquals(5,FenetreCalculette.Soustraction(5,0));
	}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Soustraction erreur")
	void testSoustractionErreur() {
		assertEquals(5,FenetreCalculette.Soustraction(5,1));
	}

	@Test
	@Tag("Fonctionne")
	@DisplayName("Multiplication")
	void testMultiplication() {
		assertAll(()->assertEquals(36,FenetreCalculette.Multiplication(6,6)),
				  ()->assertEquals(15,FenetreCalculette.Multiplication(5,3)),
				  ()->assertEquals(5,FenetreCalculette.Multiplication(5,1)));
	}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Multiplication erreur")
	void testMultiplicationErreur() {
		assertEquals(5,FenetreCalculette.Multiplication(5,0));
	}
	
	@Test
	@Tag("Fonctionne")
	@RepeatedTest(5)
	@DisplayName("Division")
	void testDivision() {
		assertEquals(5,FenetreCalculette.Division(5,1));
		
		}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Division Erreur")
	void testDivisionErreur() {
		assertEquals(10,FenetreCalculette.Division(5,1));
		assertThrows(ArithmeticException.class,()->FenetreCalculette.Division(1, 0));
		}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Division par zero")
	void testDivisionParZero() {
		assertThrows(ArithmeticException.class,()->FenetreCalculette.Division(1, 0));
		}
}
