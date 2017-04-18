package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Immobilie extends Vermoegensgegenstand {

	private long lebensdauer;
	private long kurs;

	public Immobilie(String name, String kaufdatum, double kaufpreis, long lebensdauer, double kurs) {
		super(name, kaufdatum, kaufpreis, 1);
		this.lebensdauer = lebensdauer;
		this.kurs = (long) (kurs * 100);
	}

	public long getLebensdauer() {
		return lebensdauer;
	}

	public long getKurs() {
		return kurs;
	}
	
	public double getKursAsDouble() {
		return ((double) kurs) / 100.00;
	}

	public String toString() {
//		return "  Immobillie	" + getName() + "		" + getAnzahl() + "		" + getKaufpreisAsDouble();
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("	Immobillie		%s			%s			%s", getName(), getAnzahl(), getKaufpreisAsDouble()));
		return sb.toString();
	}
}