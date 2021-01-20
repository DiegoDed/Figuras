package ar.edu.unlam.basica2.eva2;

public class Rectangulo extends Figura {
	
	private Double ladoA;
	private Double ladoB;

	
	public Rectangulo(Double ladoA, Double ladoB,String Color){
		super(Color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public Double calcularElArea() {
		Double area;
		area = ladoA * ladoB;
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetro;
		perimetro = 2*(ladoA + ladoB);
		return perimetro;
	}

	@Override
	public String dibujarFigura() {
		String className=this.getClass().getSimpleName();
		return className;
	}
}
