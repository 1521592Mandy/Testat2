package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Aktie extends Vermoegensgegenstand implements Handelbar {

	private long kurs;

	public Aktie(String name, String kaufdatum, double kaufpreis, double kurs, int anzahl) {
		super(name, kaufdatum, kaufpreis, anzahl);
		this.kurs = (long) (kurs * 100);
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

	@Override
	public String toString() {
		// return " Aktie " + getName() + " " + getAnzahl() + " " +
		// getKaufpreisAsDouble();
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("	Aktien			%s			%s			%s", getName(), getAnzahl(), getKaufpreisAsDouble()));
		return sb.toString();
	}

}
