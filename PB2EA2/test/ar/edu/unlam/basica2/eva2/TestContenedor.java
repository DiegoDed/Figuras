package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContenedor {

	@Test
	public void testQueSeAgregueUnRectangulo() {
		
		ContenedorFigura contenedor= new ContenedorFigura();
		
		Rectangulo rectangulo=new Rectangulo(2.0, 2.0, "Azul");
		Boolean valorObtenido = contenedor.agregar(rectangulo);
		Boolean valorEsperado= true;
		
		assertTrue(valorObtenido.equals(valorEsperado));
	}
	@Test
	public void testQueSeAgregueUnCirculo() {
		ContenedorFigura contenedor= new ContenedorFigura();
		
		Circulo circulo=new Circulo(2.0, "Rojo");
		Boolean valorObtenido = contenedor.agregar(circulo);
		Boolean valorEsperado= true;
		
		assertTrue(valorObtenido.equals(valorEsperado));
	}
	@Test
	public void testQueSeAgregueUnaFigura() {
		ContenedorFigura contenedor= new ContenedorFigura();
		
		Figura circulo= new Circulo(2.0, "Rojo");
		Figura Rectangulo= new Rectangulo(2.0, 2.0, "Azul");
		
		contenedor.agregar(Rectangulo);
		contenedor.agregar(circulo);
		Integer valorObtenido =contenedor.getContenedor().size();
		Integer valorEsperado= 2;
		assertTrue(valorObtenido.equals(valorEsperado));
	}
	@Test
	public void testQueVerificaQueSeObtieneRectangulos() {
		ContenedorFigura contenedor= new ContenedorFigura();
		Circulo circulo=new Circulo(2.0, "Rojo");
		Rectangulo rectangulo1=new Rectangulo(2.0, 2.0, "Azul");
		Rectangulo rectangulo2=new Rectangulo(4.0, 4.0, "Verde");
		contenedor.agregar(rectangulo1);
		contenedor.agregar(circulo);
		contenedor.agregar(rectangulo2);
		
		Integer cantidadDeRectangulos= contenedor.obtenerRectangulos().size();
		Integer cantidad= 2;
		
		assertEquals(cantidad, cantidadDeRectangulos);
	}
	
	@Test
	public void testQueElPromedioDetodasLasFiguras() {
		ContenedorFigura contenedor= new ContenedorFigura();
		Circulo circulo=new Circulo(2.0, "Rojo");
		Rectangulo rectangulo1=new Rectangulo(2.0, 2.0, "Azul");
		Rectangulo rectangulo2=new Rectangulo(4.0, 4.0, "Verde");
		contenedor.agregar(rectangulo1);
		contenedor.agregar(circulo);
		contenedor.agregar(rectangulo2);
		
		Double valorObtenido= contenedor.calcularPromedioDeAreaDeTodasLasFiguras();
		Double valorEsperado= (circulo.calcularElArea()+rectangulo1.calcularElArea()+rectangulo2.calcularElArea())/3;
		
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}
	
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
