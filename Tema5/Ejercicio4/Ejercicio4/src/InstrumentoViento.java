
public class InstrumentoViento {

	private boolean limpio;

	public InstrumentoViento(boolean limpio) {
		this.limpio = limpio;
	}
	
	public InstrumentoViento() {
		this.limpio = true;
	}

	public boolean isLimpio() {
		return limpio;
	}

	public void setLimpio(boolean limpio) {
		this.limpio = limpio;
	}

	@Override
	public String toString() {
		return "instrumentoViento [limpio=" + limpio + "]";
	}
	
	public void limpiar() {
		
	}
}
