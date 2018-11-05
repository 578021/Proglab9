package no.hvl.dat100.jpl9;

public class Laerer extends Person {
	private int maanedslonn;
	private int kontonummer;
	
	public Laerer() {
		super();
		maanedslonn = 0;
		kontonummer = 0;
	}

	public Laerer(String etternamn, String fornamn, long fodselsnummer, int maanedslonn, int kontonummer) {
		// TODO
		super(etternamn, fornamn, fodselsnummer);
		this.maanedslonn = maanedslonn;
		this.kontonummer = kontonummer;
		//throw new RuntimeException("Laerer constructor not implemented");
	}

	public int getMaanedslonn() {
		// TODO
		return maanedslonn;
		//throw new RuntimeException("getMaanedslonn not implemented");
	}

	public void setMaanedslonn(int maanedslonn) {
		// TODO
		this.maanedslonn = maanedslonn;
		//throw new RuntimeException("setMaanedslonn not implemented");
	}

	public int getKontonummer() {
		// TODO
		return kontonummer;
		//throw new RuntimeException("getKontonummer not implemented");
	}

	public void setKontonummer(int kontonummer) {
		// TODO
		this.kontonummer = kontonummer;
		//throw new RuntimeException("setKontonummer not implemented");
	}

	@Override
	public String toString() {
		// TODO
		return "LAERER" + "\n" + super.toString() + maanedslonn + "\n" + kontonummer + "\n";
		//throw new RuntimeException("toString() not implemented");

	}
}
