package mandos;

public class MandoMinicadena extends MandoADistancia implements ModificarVolumen {

	private int volumen = 30;
	private final int CANTIDAD_VOLUMEN = 10;

	public MandoMinicadena(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	public void encenderMando() {
		if (!encendido) {
			encendido = true;
			System.out.println("¡Mando de la minicadena ENCENDIDO!");
		} else {
			System.out.println("¡El mando de la minicadena YA ESTABA ENCENDIDO!");
		}
	}

	@Override
	public void apagarMando() {
		if (encendido) {
			encendido = false;
			System.out.println("¡Mando de la minicadena APAGADO!");
		} else {
			System.out.println("¡El mando de la minicadena YA ESTABA APAGADO!");
		}
	}

	@Override
	public void subirVolumen() {
		if (encendido) {
			if (volumen >= 0 && volumen < 100 && volumen + CANTIDAD_VOLUMEN < 100) {
				volumen += CANTIDAD_VOLUMEN;
				System.out.println("Volumen subido al: " + volumen);
			} else {
				System.out.println("Volumen fuera de rango");
			}
		} else {
			System.out.println("Antes de SUBIR el volumen debes de encender el mando");
		}

	}

	@Override
	public void bajarVolumen() {
		if (encendido) {
			if (volumen > 0 && volumen <= 100 && volumen - CANTIDAD_VOLUMEN > 0) {
				volumen -= CANTIDAD_VOLUMEN;
				System.out.println("Volumen bajado al: " + volumen);
			} else {
				System.out.println("Volumen fuera de rango");
			}
		} else {
			System.out.println("Antes de BAJAR el volumen debes de encender el mando");
		}

	}

	@Override
	public String toString() {
		return "MandoMinicadena [volumen=" + volumen + ", modelo=" + modelo + ", anchura=" + anchura + ", altura="
				+ altura + ", precio=" + precio + ", encendido=" + encendido + "]";
	}

	



	
	
}
