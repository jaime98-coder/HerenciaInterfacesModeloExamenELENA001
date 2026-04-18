package mandos;

public class MandoAireAcondicionado extends MandoADistancia implements ModificarVelocidad {

	private int velocidad = 0;
	private String modo = "FRIO";
	private int temperatura = 22;

	public MandoAireAcondicionado(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	public void encenderMando() {
		if (!encendido) {
			encendido = true;
			System.out.println("¡Mando del aire acondicionado ENCENDIDO!");
		} else {
			System.out.println("¡El mando del aire acondicionado YA ESTABA ENCENDIDO!");
		}
	}

	@Override
	public void apagarMando() {
		if (encendido) {
			encendido = false;
			System.out.println("¡Mando del aire acondicionado APAGADO!");
		} else {
			System.out.println("¡El mando del aire acondicionado YA ESTABA APAGADO!");
		}
	}

	/**
	 * Para subir la velocidad de 1 en 1 y se controla el rango máximo (3) Antes, se
	 * controla que el mando esté encendido
	 */
	@Override
	public void subirVelocidad() {
		if (encendido) {
			if (velocidad < 5) {
				velocidad++;
				System.out.println("Velocidad subida al: " + velocidad);
			} else {
				System.out.println(
						"Velocidad al " + velocidad + ". Velocidad máxima alcanzada, no es posible seguir subiendo");
			}
		} else {
			System.out.println("Debes encender el mando del aire acondicionado antes de intentar subir la velocidad");
		}
	}

	/**
	 * Para bajar la velocidad de 1 en 1 y se controla el rango mínimo (0) Antes, se
	 * controla que el mando esté encendido
	 */
	@Override
	public void bajarVelocidad() {
		if (encendido) {
			if (velocidad > 0) {
				velocidad--;
				System.out.println("Velocidad bajada al: " + velocidad);
			} else {
				System.out.println(
						"Velocidad al " + velocidad + ". Velocidad máxima alcanzada, no es posible seguir subiendo");
			}
		} else {
			System.out.println("Debes encender el mando  del aire acondicionado antes de intentar subir la velocidad");
		}
	}

	/**
	 * Para cambiar de modo FRIO a modo CALOR
	 */
	public void cambiarModo() {
		if (modo.equalsIgnoreCase("FRIO")) {
			this.modo = "CALOR";
			System.out.println("Modo cambiado a : " + modo);
		} else {
			this.modo = "FRIO";
			System.out.println("Modo cambiado a : " + modo);
		}
	}

	public void subirTemperatura() {
		if (encendido) {
			if (temperatura >= 16 && temperatura < 30) {
				temperatura++;
				System.out.println("Temperatura subida al : " + temperatura);
			} else {
				System.out.println("Temperatura al " + temperatura
						+ ". Temperatura máxima alcanzada, no es posible seguir subiendo");
			}
		} else {
			System.out.println("Debes encender el mando del aire acondicionado antes de intentar subir la temperatura");
		}
	}

	public void bajarTemperatura() {
		if (encendido) {
			if (temperatura > 16 && temperatura <= 30) {
				temperatura--;
				System.out.println("Temperatura bajada al : " + temperatura);
			} else {
				System.out.println("Temperatura al " + temperatura
						+ ". Temperatura mínima alcanzada, no es posible seguir bajando");
			}
		} else {
			System.out.println("Debes encender el mando del aire acondicionado antes de intentar bajar la temperatura");
		}
	}

	@Override
	public String toString() {
		return "MandoAireAcondicionado [velocidad=" + velocidad + ", modo=" + modo + ", temperatura=" + temperatura
				+ ", modelo=" + modelo + ", anchura=" + anchura + ", altura=" + altura + ", precio=" + precio
				+ ", encendido=" + encendido + "]";
	}

}
