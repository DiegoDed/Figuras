package ar.edu.unlam.basica2.eva2;

import java.lang.Math;

public class Circulo extends Figura {

	private Double radio;
	
	public Circulo(double radio,String Color){
		super(Color);
		this.radio = radio;
	}

	@Override
	public Double calcularElArea() {
		Double area;
		area = Math.PI * Math.pow(radio,2);
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetro;
		perimetro= 2*Math.PI*radio;
		return perimetro;
	}

	@Override
	public String dibujarFigura() {
		String className=this.getClass().getSimpleName();
		return className;
	}

	
}
