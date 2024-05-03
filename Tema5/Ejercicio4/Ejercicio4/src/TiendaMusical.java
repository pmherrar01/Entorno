
public class TiendaMusical {

	public static void afinar() {

	}

	public static void alquilar() {

	}

	public static void main(String[] args) {

		TiendaMusical tienda = new TiendaMusical();


		InstrumentoViento flauta = new Flauta();
		tienda.alquilar();
		tienda.afinar();


		InstrumentoPercusion tambor = new Tambor();
		tienda.alquilar();
		tienda.afinar();




	}

}
