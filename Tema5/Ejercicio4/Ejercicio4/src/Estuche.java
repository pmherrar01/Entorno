
public class Estuche {
	private double altura;
	private double anchura; 
	private String color;
	
	public Estuche(double altura, double anchura, String color) {
		this.altura = altura;
		this.anchura = anchura;
		this.color = color;
	}
	
	public Estuche() {
		this.altura = 0;
		this.anchura = 0;
		this.color = "";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "estuche [altura=" + altura + ", anchura=" + anchura + ", color=" + color + "]";
	}
	
	
}
