package com.objis.demoswing;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@DisplayName("Tests Calculatrice")
class TestCalculette {

	@AfterEach
	void Nettoyage() {
		System.out.println("Nettoyage.........");
	}
	
	@Test
	@Tag("Fonctionne")
	@DisplayName("Addition")
	void testAddition() {
		boolean assume=true;
		assumeTrue(assume);
		assertEquals(5,FenetreCalculette.Addition(5,0),"L'addition doit fonctionner");
		System.out.println("L'addition doit fonctionner");
	}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Addition erreur")
	void testAdditionErreur() {
		assertEquals(5,FenetreCalculette.Addition(5,1),"L'addition ne doit pas fonctionner");
		System.out.println("L'addition ne doit pas fonctionner");

	}
	
	@Test
	@Tag("Fonctionne")
	@DisplayName("Soustraction")
	void testSoustraction() {
		assertEquals(5,FenetreCalculette.Soustraction(5,0),"La soustraction doit fonctionner");
		System.out.println("La soustraction doit fonctionner");
	}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Soustraction erreur")
	void testSoustractionErreur() {
		assertEquals(5,FenetreCalculette.Soustraction(5,1),"La soustraction ne doit pas fonctionner");
		System.out.println("La soustraction ne doit pas fonctionner");
	}

	@Test
	@Tag("Fonctionne")
	@DisplayName("Multiplication")
	void testMultiplication() {
		assertAll(()->assertEquals(36,FenetreCalculette.Multiplication(6,6),"La multiplication doit fonctionner"),
				  ()->assertEquals(15,FenetreCalculette.Multiplication(5,3),"La multiplication doit fonctionner"),
				  ()->assertEquals(5,FenetreCalculette.Multiplication(5,1),"La multiplication doit fonctionner"));
		System.out.println("Les multplications doivent fonctionner");
	}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Multiplication erreur")
	void testMultiplicationErreur() {
		assertEquals(5,FenetreCalculette.Multiplication(5,0),"La multiplication ne doit pas fonctionner");
		System.out.println("La multplication ne doit pas fonctionner");
	}
	
	@Test
	@Tag("Fonctionne")
	@RepeatedTest(1)
	@DisplayName("Division")
	void testDivision() {
		assertEquals(5,FenetreCalculette.Division(5,1),"La division doit fonctionner");
		System.out.println("La division doit fonctionner");
		}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Division Erreur")
	void testDivisionErreur() {
		assertEquals(10,FenetreCalculette.Division(5,1),"La division ne doit pas fonctionner");
		System.out.println("La division ne doit pas fonctionner");
		}
	
	@Test
	@Tag("Erreurs")
	@DisplayName("Division par zero")
	void testDivisionParZero() {
		assertThrows(ArithmeticException.class,()->FenetreCalculette.Division(1, 0),"La division ne doit pas fonctionner à cause d la division par zero");
		System.out.println("La division ne doit pas fonctionner à cause d la division par zero");
		}
}
