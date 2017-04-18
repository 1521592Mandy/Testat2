package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Rentenpapier extends Festgeld implements Handelbar {

	private long kurs;

	public Rentenpapier(String name, String kaufdatum, double kaufpreis, double zinssatz, long laufzeit, int anzahl) {
		super(name, kaufdatum, kaufpreis, zinssatz, laufzeit, anzahl);
		this.kurs = (long) (kaufpreis * 100);
		anzahl++;
	}

	public long getKurs() {
		return kurs;
	}

	public double getKursAsDouble() {
		return ((double) kurs) / 100.00;
	}

	public void setKurs(long neuerKurs) {
		kurs = neuerKurs;
	}

	// TO-STRING!!!
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("	Schatzbrief			%s			%s			%s", getName(), getAnzahl(),
				getKaufpreisAsDouble()));
		return sb.toString();
	}
}