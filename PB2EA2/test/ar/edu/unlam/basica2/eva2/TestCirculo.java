package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCirculo {

	//Desarrolle Todos Los test para verificar el correcto funcionamiento de Un circulo 
	@Test
	public void TestCalcularElAreaDeUnCirculo() {
		Circulo circulo=new Circulo(2.0,"Rojo");
		Double valorObtenido=circulo.calcularElArea();
		Double valorEsperado=Math.PI * Math.pow(2.0,2);
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

	@Test
	public void TestCalcularElPerimetroDeUnCirculo() {
		Circulo circulo=new Circulo(2.0,"Rojo");
		
		Double valorObtenido=circulo.calcularElPerimetro();
		Double valorEsperado=2*Math.PI*2.0;
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
		
	}

	@Test
	public void TestDibujarFiguraDeUnCirculo() {
		Circulo circulo=new Circulo(2.0,"Rojo");
		String valorObtenido= circulo.dibujarFigura();
		String valorEsperado="Circulo";
		assertTrue(valorObtenido.equals(valorEsperado));
	}
}
