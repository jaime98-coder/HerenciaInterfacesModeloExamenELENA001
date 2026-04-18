package mandos;

public class MandoAspiradora extends MandoADistancia implements ModificarVelocidad {

	private int velocidad = 0;

	public MandoAspiradora(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	public void encenderMando() {
		if (!encendido) {
			encendido = true;
			System.out.println("¡Mando de la aspiradora ENCENDIDO!");
		} else {
			System.out.println("¡El mando de la aspiradora YA ESTABA ENCENDIDO!");
		}
	}

	@Override
	public void apagarMando() {
		if (encendido) {
			encendido = false;
			System.out.println("¡Mando de la aspiradora APAGADA!");
		} else {
			System.out.println("¡El mando de la aspiradora YA ESTABA APAGADO!");
		}
	}

	/**
	 * Para subir la velocidad de 1 en 1 y se controla el rango máximo (3) Antes, se
	 * controla que el mando esté encendido
	 */
	@Override
	public void subirVelocidad() {
		if (encendido) {
			if (velocidad < 3) {
				velocidad++;
				System.out.println("Velocidad subida al: "+velocidad);
			} else {
				System.out.println(
						"Velocidad al " + velocidad + ". Velocidad máxima alcanzada, no es posible seguir subiendo");
			}
		} else {
			System.out.println("Debes encender el mando de la aspiradora antes de intentar subir la velocidad");
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
				System.out.println("Velocidad bajada al: "+velocidad);
			} else {
				System.out.println(
						"Velocidad al " + velocidad + ". Velocidad máxima alcanzada, no es posible seguir subiendo");
			}
		} else {
			System.out.println("Debes encender el mando de la aspiradora antes de intentar subir la velocidad");
		}
	}

	@Override
	public String toString() {
		return "MandoAspiradora [velocidad=" + velocidad + ", modelo=" + modelo + ", anchura=" + anchura + ", altura="
				+ altura + ", precio=" + precio + ", encendido=" + encendido + "]";
	}

}
