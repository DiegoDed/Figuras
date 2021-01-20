package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRectangulo {

	//Desarrolle Todos Los test para verificar el correcto funcionamiento de Un Rectangulo
	@Test
	public void TestCalcularElAreaDeUnRectangulo() {
		Rectangulo rectangulo=new Rectangulo(2.0,2.0,"Azul");
		Double valorObtenido=rectangulo.calcularElArea();
		Double valorEsperado=2.0*2.0;
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

	@Test
	public void TestCalcularElPerimetroDeUnRectangulo() {
		Rectangulo rectangulo=new Rectangulo(2.0,2.0,"Azul");
		
		Double valorObtenido=rectangulo.calcularElPerimetro();
		Double valorEsperado=2.0*(2.0+2.0);
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
		
	}

	@Test
	public void TestDibujarFiguraDeUnRectangulo() {
		Rectangulo rectangulo=new Rectangulo(2.0,2.0,"Azul");
		String valorObtenido= rectangulo.dibujarFigura();
		String valorEsperado="Rectangulo";
		assertTrue(valorObtenido.equals(valorEsperado));
	}
}
