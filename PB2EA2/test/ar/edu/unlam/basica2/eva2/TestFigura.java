package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFigura {
		
	@Test
	public void testQueVerificaQueUnaMismaFiguraSePuedaInstanciaTantoComoUnRectangoYTambienComoUncirculo() {
		
		Figura figura1= new Circulo(2.0, "rojo");
		Figura figura2= new Rectangulo(2.0, 4.0, "Azul");
		String valorObtenido1=figura1.dibujarFigura();
		String valorEsperado1= "Circulo";
		
		String valorObtenido2=figura2.dibujarFigura();
		String valorEsperado2= "Rectangulo";
		
		assertTrue(valorObtenido1.equals(valorEsperado1));
		assertTrue(valorObtenido2.equals(valorEsperado2));
	}

}