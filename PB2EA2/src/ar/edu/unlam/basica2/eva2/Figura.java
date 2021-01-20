package ar.edu.unlam.basica2.eva2;

public abstract class Figura {
	
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Figura (String color) {
		this.color=color;
	}
	public Figura(){
		this.color = "Negro";
	}
	
	public abstract Double calcularElArea();
	public abstract Double calcularElPerimetro();
	//Devuelve Un String Informando EL nombre con el cual se instancio Una figura 
	public abstract String dibujarFigura();
	
	

}
