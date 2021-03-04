package com.jarroba.ejemplo.JunitPrueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class testing {
	Geometria geo;
	
	@BeforeEach
	 public void before() {
		geo =new Geometria(4);
		System.out.println("before");	
	}
	
	@Test
	void constructor1() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria();
		assertEquals(9, geom.getId());
	}
	
	@Test
	void constructor2() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria();
		geom.setId(4);
		geom.setNom("Rectangulo");
		geom.setArea(55);

		assertEquals("Rectangulo", geom.getNom());
		assertEquals(55, geom.getArea());
		assertEquals("Geometria [id=4, nom=Rectangulo, area=55.0]", geom.toString());
	}
	
	@Test
	void constructor3() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(1);
		assertEquals("cuadrado", geom.getNom());
	}
	
	@Test
	void constructor4() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(2);
		assertEquals("Circulo", geom.getNom());
	}
	
	@Test
	void constructor5() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(3);
		assertEquals("Triangulo", geom.getNom());
	}
	
	@Test
	void constructor6() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(5);
		assertEquals("Pentagono", geom.getNom());
	}
	
	@Test
	void constructor7() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(6);
		assertEquals("Rombo", geom.getNom());
	}
	
	@Test
	void constructor8() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(7);
		assertEquals("Romboide", geom.getNom());
	}
	
	@Test
	void constructor9() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(8);
		assertEquals("Trapecio", geom.getNom());
	}
	
	@Test
	void constructor10() {
		System.out.println("Constructor()");
		Geometria geom =new Geometria(10);
		assertEquals("Default", geom.getNom());
	}
	
	@Test
	void areaCuadrado() {
		System.out.println("areaCuadrado()");
		int resultado=geo.areacuadrado(4);
		int esperado = 16;
		assertEquals(resultado, esperado);
	}
	
	@Test
	void areaCirculo() {
		System.out.println("areaCirculo()");
		double resultado=geo.areaCirculo(2);
		double esperado= 13;
		assertEquals(esperado, resultado, 0.5);
	}

	
	@Test
	//metodo area del triangulo
		void areatriangulo(){
			System.out.println("areatriangulo()");
			int resultado=geo.areatriangulo(5,10);
			int esperado= 25;
			assertEquals(esperado, resultado);
		
		}
	@Test
		//metodo area del rectangulo
		void arearectangulo(){
			System.out.println("arearectangulo()");
			int resultado=geo.arearectangulo(5,11);
			int esperado= 55;
			assertEquals(esperado, resultado);
			}
	@Test	
		//metodo area del rectangulo
		void areapentagono(){
			System.out.println("areapentagono()");
			int resultado=geo.areapentagono(5,10);
			int esperado= 25;
			assertEquals(esperado, resultado);
			}
	@Test	
		//metodo area del rectangulo
		void arearombo(){
			System.out.println("arearombo()");
			int resultado=geo.arearombo(5,10);
			int esperado= 25;
			assertEquals(esperado, resultado);
			}
	@Test	
		//metodo area del rectangulo
		void arearomboide(){
			System.out.println("arearomboide()");
			int resultado=geo.arearomboide(5,11);
			int esperado= 55;
			assertEquals(esperado, resultado);
			
			}
	@Test	
		//metodo area del rectangulo
		void areatrapecio (){ 
			System.out.println("areatrapecio()");
			int resultado=geo.areatrapecio(5,11,3);
			int esperado= 24;
			assertEquals(esperado, resultado);
			}
	

}
