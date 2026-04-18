package mandos;

public abstract class MandoADistancia implements Comparable<MandoADistancia> {

	protected String modelo;
	protected double anchura;
	protected double altura;
	protected double precio;
	protected boolean encendido = false;

	public MandoADistancia(String modelo, double anchura, double altura, double precio) {
		this.modelo = modelo;
		setAnchura(anchura);
		setAltura(altura);
		setPrecio(precio);
	}

	public String getModelo() {
		return modelo;
	}

	private void setAnchura(double anchura) {
		if (anchura >= 0) {
			this.anchura = anchura;
		}
	}

	private void setAltura(double altura) {
		if (altura >= 0) {
			this.altura = altura;
		}
	}

	private void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	public abstract void encenderMando();

	public abstract void apagarMando();

	/**
	 * 
	 * @param obj. Cualquier objeto para comparar
	 * @return sonIguales. True--> Si tienen el mismo modelo ,son el mismo objeto.
	 *         False --> No es mismo objeto
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (obj instanceof MandoADistancia) {
			if (modelo.equalsIgnoreCase(((MandoADistancia) obj).modelo)) {
				sonIguales = true;
			}
		}
		return sonIguales;
	}

	// REVISAR COMPARE TO (ORDEN ALFABETICO)
	@Override
	public int compareTo(MandoADistancia otroMando) {
		return modelo.compareTo(otroMando.getModelo());

	}

	@Override
	public String toString() {
		return "MandoADistancia [modelo=" + modelo + ", anchura=" + anchura + ", altura=" + altura + ", precio="
				+ precio + ", encendido=" + encendido + "]";
	}

}
