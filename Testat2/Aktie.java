package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Aktie extends VermoegensGegenstand implements Handelbar {
	private long kurs;
	private long kurs1;
	private long kurs2;
	private static int anzahl;

	public Aktie(long kurs, String name, long kaufpreis, String kaufdatum) {
		super(name, kaufpreis, kaufdatum);
		anzahl++;
	}

	public Aktie(double kurs1, double kurs2) {
		this.kurs1 = (long) kurs1;
		this.kurs2 = (long) kurs2;
	}

	public long getKurs1() {
		return kurs1;
	}

	public long getKurs2() {
		return kurs2;
	}

	public static int getAnzahl() {
		return anzahl;
	}

	public void setKurs(long neuerKurs) {
		kurs = neuerKurs;
	}

}
