package principal;

import java.util.Arrays;

import mandos.*;

public class Main {
	public static void main(String[] args) {
		MandoADistancia[] tablaMandos = new MandoADistancia[10];
		MandoADistancia mandoTelevisor = new MandoTelevisor("Samsung", 5, 12, 35);
		MandoADistancia mandoTelevisor2 = new MandoTelevisor("LG", 5, 14, 30);
		MandoADistancia mandoMinicadena = new MandoMinicadena("BOSE", 10, 20, 85);
		MandoADistancia mandoMinicadena2 = new MandoMinicadena("JBL", 10, 10, 35);
		MandoADistancia mandoAspiradora = new MandoAspiradora("Fragor", 6, 18, 20);
		MandoADistancia mandoAspiradora2 = new MandoAspiradora("Absorb", 4, 16, 22);
		MandoADistancia mandoAireAcondicionado = new MandoAireAcondicionado("Daitsu", 5, 16, 8);
		MandoADistancia mandoAireAcondicionado2 = new MandoAireAcondicionado("Daitsu", 4, 14, 7);
		MandoADistancia mandoAireAcondicionado3 = new MandoAireAcondicionado("Cold", 6, 17, 15);
		MandoADistancia mandoAireAcondicionado4 = new MandoAireAcondicionado("Freezer", 5, 12, 23);
		tablaMandos[0] = mandoTelevisor;
		tablaMandos[1] = mandoTelevisor2;
		tablaMandos[2] = mandoMinicadena;
		tablaMandos[3] = mandoMinicadena2;
		tablaMandos[4] = mandoAspiradora;
		tablaMandos[5] = mandoAspiradora2;
		tablaMandos[6] = mandoAireAcondicionado;
		tablaMandos[7] = mandoAireAcondicionado2;
		tablaMandos[8] = mandoAireAcondicionado3;
		tablaMandos[9] = mandoAireAcondicionado4;
		System.out.println("Tabla antes de ordenar: ");
		imprimirTablaMandos(tablaMandos);
		System.out.println("Tabla después de ordenar: ");
		Arrays.sort(tablaMandos);
		imprimirTablaMandos(tablaMandos);

		for (MandoADistancia mando : tablaMandos) {
			mando.encenderMando();
			if (mando instanceof MandoTelevisor) {
				((MandoTelevisor) mando).subirCanal();
				((MandoTelevisor) mando).subirVolumen();
				((MandoTelevisor) mando).bajarVolumen();
			} else if (mando instanceof MandoMinicadena) {
				((MandoMinicadena) mando).subirVolumen();
				((MandoMinicadena) mando).bajarVolumen();
			} else if (mando instanceof MandoAspiradora) {
				((MandoAspiradora) mando).subirVelocidad();
				((MandoAspiradora) mando).bajarVelocidad();
			} else if (mando instanceof MandoAireAcondicionado) {
				((MandoAireAcondicionado) mando).cambiarModo();
				((MandoAireAcondicionado) mando).subirTemperatura();
				((MandoAireAcondicionado) mando).bajarTemperatura();
				((MandoAireAcondicionado) mando).subirVelocidad();
				((MandoAireAcondicionado) mando).bajarVelocidad();
			}
		}

	}

	private static void imprimirTablaMandos(MandoADistancia[] tablaMandos) {
		for (MandoADistancia mando : tablaMandos) {
			System.out.println("\n" + mando.toString());
		}
	}

}
