package ar.edu.unlam.basica2.eva2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ContenedorFigura {

	ArrayList<Figura> contenedor= new ArrayList<Figura>();
	
	
	public Boolean agregar (Figura figura) {
		return contenedor.add(figura);
	}
	
	public ArrayList <Rectangulo> obtenerRectangulos (){
		ArrayList<Rectangulo> contenedorDeRectangulo= new ArrayList<Rectangulo>();
		for(Figura f: contenedor) {
			if(f.dibujarFigura().equals("Rectangulo")) {
				contenedorDeRectangulo.add((Rectangulo) f);
			}
		}
		return contenedorDeRectangulo;
	}
	
	public LinkedList <Circulo> obtenerCirculos() {
		LinkedList<Circulo> contenedorDeCirculo= new LinkedList<Circulo>();
		for(Figura f: contenedor) {
			if(f.dibujarFigura().equals("Circulo")) {
				contenedorDeCirculo.add((Circulo) f);
			}
		}
		return contenedorDeCirculo;
	}
	
	public Double calcularPromedioDeAreaDeTodasLasFiguras() {
		Double promedioArea= 0.0;
		Double contador=0.0;
		for(Figura f: contenedor) {
			promedioArea= promedioArea+ f.calcularElArea();
			contador++;
		}
		promedioArea= promedioArea/ contador;
		return promedioArea;
	}

	public ArrayList<Figura> getContenedor() {
		return contenedor;
	}
	
}
