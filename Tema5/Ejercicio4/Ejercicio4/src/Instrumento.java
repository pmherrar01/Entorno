
public class Instrumento {
	private String nombre;
    private int codigo;
	
    public Instrumento(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
    
    public Instrumento() {
		this.nombre = "";
		this.codigo = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", codigo=" + codigo + "]";
	}


}