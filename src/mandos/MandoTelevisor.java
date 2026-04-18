package mandos;

public class MandoTelevisor extends MandoADistancia implements ModificarVolumen {

	private int volumen = 30;
	private int canal = 1;
	private final int CANTIDAD_VOLUMEN = 5;

	public MandoTelevisor(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override	
	public void encenderMando() {
		if (!encendido) {
			encendido = true;
			System.out.println("¡Mando del televisor ENCENDIDO!");
		} else {
			System.out.println("¡El mando del televisor YA ESTABA ENCENDIDO!");
		}
	}

	
	@Override
	public void apagarMando() {
		if (encendido) {
			encendido = false;
			System.out.println("¡Mando del televisor APAGADO!");
		} else {
			System.out.println("¡El mando del televisor YA ESTABA APAGADO!");
		}
	}

	@Override
	public void subirVolumen() {
		if (encendido) {
			if (volumen >= 0 && volumen < 100 && volumen + CANTIDAD_VOLUMEN <= 100) {
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
			if (volumen > 0 && volumen <= 100 && volumen - CANTIDAD_VOLUMEN >= 0) {
				volumen -= CANTIDAD_VOLUMEN;
				System.out.println("Volumen bajado al: " + volumen);
			} else {
				System.out.println("Volumen fuera de rango");
			}
		} else {
			System.out.println("Antes de BAJAR el volumen debes de encender el mando");
		}

	}

	/**
	 * Para subir el canal de la TV
	 * (Si llega a 999, pasa al primero)
	 */
	public void subirCanal() {
		if (encendido) {
			if (canal == 999) {
				canal = 1;
				System.out.println("Canal cambiado al : "+canal);
			} else {
				canal++;
				System.out.println("Canal cambiado al : " + canal);
			}
		} else {
			System.out.println("Antes de CAMBIAR el canal debes de encender el mando");
		}

	}
	
	/**
	 * Para bajar el canal de la TV
	 * (Si llega a 0, pasa al último)
	 */

	public void bajarCanal() {
		if (encendido) {
			if (canal == 0) {
				canal = 999;
				System.out.println("Canal cambiado al : " + canal);
			} else {
				canal--;
				System.out.println("Canal cambiado al : " + canal);
			}
		} else {
			System.out.println("Antes de CAMBIAR el canal debes de encender el mando");
		}

	}

	@Override
	public String toString() {
		return "MandoTelevisor [volumen=" + volumen + ", canal=" + canal + ", modelo=" + modelo + ", anchura=" + anchura
				+ ", altura=" + altura + ", precio=" + precio + ", encendido=" + encendido + "]";
	}

	
	
}
